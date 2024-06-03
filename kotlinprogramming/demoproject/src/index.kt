import java.util.*
interface Display {
    fun showEventDetails(event: Event)
}
data class Event(val name: String, val date: String, val location: String)
class EventManager1 : Display {
    override fun showEventDetails(event: Event) {
        println("Event: ${event.name}")
        println("Date: ${event.date}")
        println("Location: ${event.location}")
    }
}
fun main() {
    val eventManager = EventManager()
    val event = Event("Birthday Party", "May 25, 2024", "123 Main Street")
    eventManager.showEventDetails(event)
}