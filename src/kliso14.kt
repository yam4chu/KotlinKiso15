
fun main(args: Array<String>) {
    println("二つの同じ言葉を入力してください。")
    while (true) {
        println("一つ目")
        val str1 = readLine()
        println("二つ目")
        val str2 = readLine()
        // kotlinでは 「==」 は　.equals()と同等の処理になる
        if (str1 == str2) {
            println("同じ言葉です。\n終了")
            break
        }
        println("違う言葉です。同じ言葉を入力してください。")
    }


}