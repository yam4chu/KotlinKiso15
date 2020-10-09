import java.lang.NumberFormatException
import kotlin.system.exitProcess

fun main(args:Array<String>) {
    println("数値を入力してください。")
    var num : Int = 0;

    try {
        num = readLine()?.toInt()?:0;
    } catch(e : NumberFormatException) {
        kotlin.io.println("正しく数字を入力してください")
    }

    for (i in 1..num) {
        for (j :Int in 1..num) {
            if (i == j) {
                print("*")
            } else {
                print("・")
            }
        }
        println()
    }
}
