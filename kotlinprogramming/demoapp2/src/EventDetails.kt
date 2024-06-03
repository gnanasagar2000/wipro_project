import java.util.*

data class EventDetails(
    val name: String,
    val date: Date,
    val attendeeCount: Int
)

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to the Event Creator!")

    print("Enter event name: ")
    val name = scanner.nextLine()

    print("Enter event date (YYYY-MM-DD): ")
    val dateString = scanner.nextLine()
    val date = Date(dateString) // Note: This constructor is deprecated, use a proper date parsing library in production.

    print("Enter attendee count: ")
    val attendeeCount = scanner.nextInt()

    val event = Event(name, date, attendeeCount)

    println("New event created:")
    println("Event Name: ${event.name}")
    println("Event Date: ${event.date}")
    println("Attendee Count: ${event.attendeeCount}")
}
