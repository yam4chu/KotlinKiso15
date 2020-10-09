import java.lang.NumberFormatException
import kotlin.system.exitProcess

fun main(args:Array<String>) {
    println("数字を二つ入力してください。")
    println("入力した数字の積とそれを2で割った数を計算します")
    try {
        var num1 = readLine()!!.toInt()
        var num2 = readLine()!!.toInt()
        println("数字1と数字2の積は" + shikaku(num1, num2) + "です")
        println("積を2で割った数は" + sankaku(num1, num2) + "です")
    } catch(e:NumberFormatException) {
        println("正しく数値を入力してください。")
    }
}

private fun shikaku(num1: Int ,num2: Int) : Int {
    return num1 * num2
}

private fun sankaku(num1: Int, num2:Int): Int {
    return num1 * num2 / 2
}
