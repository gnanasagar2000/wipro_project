import java.util.*
class EventManager {
    private val events: MutableSet<String> = HashSet()
    fun addEvent(event: String) {
        events.add(event)
        println("Event '$event' added.")
    }
    fun removeEvent(event: String) {
        if (events.remove(event)) {
            println("Event '$event' removed.")
        } else {
            println("Event '$event' not found.")
        }
    }
    fun displayEvents() {
        if (events.isEmpty()) {
            println("No events found.")
        } else {
            println("Events:")
            for (event in events) {
                println("- $event")
            }
        }
    }
}
fun main() {
    val eventManager = EventManager()
    eventManager.addEvent("Birthday Party")
    eventManager.addEvent("Conference")
    eventManager.addEvent("Wedding")
    eventManager.displayEvents()

    eventManager.removeEvent("Conference")
    eventManager.removeEvent("Anniversary")
    eventManager.displayEvents()
}