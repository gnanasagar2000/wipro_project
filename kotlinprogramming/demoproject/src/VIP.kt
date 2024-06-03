import java.util.*
open class Event(val name: String, val date: String, val location: String)
class SpecialEvent(
    name: String,
    date: String,
    location: String,
    val vipList: List<String>,
    val premiumServices: List<String>
) : Event(name, date, location)
fun main() {
    val specialEvent = SpecialEvent(
        "Gala Dinner",
        "December 15, 2024",
        "Grand Wedding",
        listOf("Theja", "Keerthi"),
        listOf("VIP Lounge Access", "Exclusive Dining Menu")
    )
    println("Special Event Details:")
    println("Name: ${specialEvent.name}")
    println("Date: ${specialEvent.date}")
    println("Location: ${specialEvent.location}")
    println("VIP List: ${specialEvent.vipList.joinToString()}")
    println("Premium Services: ${specialEvent.premiumServices.joinToString()}")
}