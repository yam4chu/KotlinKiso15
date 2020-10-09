import kotlin.system.exitProcess
import kotlin.NumberFormatException

fun main(args:Array<String>) {
    println("数値を入力してください。")
    var num : Int = 0
    try {
        num = readLine()?.toInt() ?:0
        var input : String? = null
        num = Integer.parseInt(null)
    } catch (e: NumberFormatException) {
        println("正しく数値を入力してください。")
        exitProcess(0)
    }

    if(num % 2 == 0) {
        println("偶数です。")
    } else {
        println("奇数です。")
    }
}

