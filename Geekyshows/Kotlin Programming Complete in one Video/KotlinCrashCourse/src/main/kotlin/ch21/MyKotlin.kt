/*** Calling Java from Kotlin ***/
import ch21.MyJava

fun main() {
    val obj = MyJava()
    obj.setValue(10)
    println(obj.getValue())
}