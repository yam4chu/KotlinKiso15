import areaCalc.AreaCalc
import java.lang.NumberFormatException

class Kiso12 : AreaCalc {

    override fun sankaku(a: Int, b: Int): Int {
        return a * b / 2
    }

    override fun shikaku(a: Int, b: Int): Int {
        return a * b
    }
}

fun main(args:Array<String>) {
    println("数字を二つ入力してください。")
    println("入力した数字の積とそれを2で割った数を計算します")
    try {
        var num1 = readLine()!!.toInt()
        var num2 = readLine()!!.toInt()
        println("数字1と数字2の積は" + Kiso12().shikaku(num1, num2) + "です")
        println("積を2で割った数は" + Kiso12().sankaku(num1, num2) + "です")
    } catch(e: NumberFormatException) {
        println("正しく数値を入力してください。")
    }
}
