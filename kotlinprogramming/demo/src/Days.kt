enum class Days(var color: String) {
    Sunday("yellow"),
    Monday(""),
    Tuesday(""),
    Wednesday(""),
    Thursday(""),
    Friday(""),
    Saturday("")
}

fun main() {
    val color = Days.Sunday.color;
}