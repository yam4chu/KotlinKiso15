import java.lang.NumberFormatException
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var inputs : Array<String?> = arrayOfNulls(5)
    for (i : Int in 0..4) {
        print("文字を入力してください：")
        inputs[i] = readLine()
    }
    print("入力された文字は ")
    for (i in inputs) {
        print(" $i")
    }
}