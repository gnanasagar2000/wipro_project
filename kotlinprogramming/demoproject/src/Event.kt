import java.util.*
data class Event(val name: String, val date: String, val location: String)
typealias EventUpdateListener = (Event) -> Unit
class EventManager {
    private val eventUpdateListeners = mutableListOf<EventUpdateListener>()
    fun addEventUpdateListener(listener: EventUpdateListener) {
        eventUpdateListeners.add(listener)
    }
    fun notifyEventUpdate(event: Event) {
        eventUpdateListeners.forEach { listener ->
            listener(event)
        }
    }
    fun updateEventDetails(event: Event, newDate: String, newLocation: String) {
        val updatedEvent = event.copy(date = newDate, location = newLocation)
        notifyEventUpdate(updatedEvent)
    }
}
fun main() {
    val eventManager = EventManager()
    eventManager.addEventUpdateListener { event ->
        println("Event update notification:")
        println("Event: ${event.name}")
        println("Date: ${event.date}")
        println("Location: ${event.location}")
    }
    val event = Event("Birthday Party", "May 25, 2024", "123 Main Street")
    eventManager.updateEventDetails(event, "June 1, 2024", "456 Elm Street")
}