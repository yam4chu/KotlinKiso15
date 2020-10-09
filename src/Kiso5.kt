import java.lang.NumberFormatException
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    println("0~6の数字を入力してください\n対応した曜日を出力します")

    val input : String? = readLine()
    try {
        when (input!!.toInt()) {
            1 -> {println("日曜日")}
            2 -> {println("月曜日")}
            3 -> {println("火曜日")}
            4 -> {println("水曜日")}
            5 -> {println("木曜日")}
            6 -> {println("日曜日")}
            else -> {println("0~6の数字を入力してください")}
        }
    } catch (e : NumberFormatException) {
        println("数字を入力してください")
    }
}