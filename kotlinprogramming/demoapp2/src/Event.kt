import java.util.Date

data class Event(
    val name: String,
    val date: Date,
    val attendeeCount: Int
)

fun main() {
    val event = Event("Birthday Party", Date(), 17)

    println("Event Name: ${event.name}")
    println("Event Date: ${event.date}")
    println("Attendee Count: ${event.attendeeCount}")
}



