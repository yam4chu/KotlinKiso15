import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var inputs : Array<Int> = Array(5){it}
    println("5個の整数を入力してください。")
    try {
        for (i: Int in 0..4) {
            print("${i + 1} 個目の整数：")
            inputs[i] = readLine()!!.toInt()
        }
    }catch (e: NumberFormatException) {
        println("正しく数値を入力してください。")
            exitProcess(0)
    }
    var tmp : Int = 0;
    for (i: Int  in 0 until  inputs.size) {
        for (j: Int in i + 1 until  inputs.size) {
            if (inputs[i] > inputs[j]) {
                tmp = inputs[j]
                inputs[j] = inputs[i]
                inputs[i] = tmp
            }
        }
    }
    println("昇順並び替え")
    for (i in inputs) {
        print(" $i")
    }
    println("最大値は${inputs[4]}で、最小値は${inputs[0]}です。")
}