import java.lang.NumberFormatException

fun main(args: Array<String>) {
    println("平均を表示したい値を入力してください。平均を表示したい値をすべて入力したら「OK」を入力してください。")
    var ary = mutableListOf<Int>()
    while (true) {
        println("数字かOKを入力してください。")
        var str = readLine()
        if (str == "OK") break
        try {
            ary.add(str!!.toInt())
        } catch (e : NumberFormatException) {
            println("正しく数値を入力して下さい")
        }
    }
    var index = 1
    for ( num in ary) {
        println("${index}個目の値は、　$num")
        index++
    }
    println("入力した数値の平均は: ${ary.sum() / ary.size}")
}