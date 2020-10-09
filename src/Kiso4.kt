import java.lang.Number
fun main(args: Array<String>) {


    println("数字を入力してください")
    println("「100」を入力した数字で除算します")
    try {
        var input= Integer.parseInt(readLine())
        println("答えは${100 / input}")
    } catch(e:NumberFormatException) {
        println("正しい数値を入力してください")
    } catch (e:ArithmeticException) {
        println("0で除算できません")
    }
}