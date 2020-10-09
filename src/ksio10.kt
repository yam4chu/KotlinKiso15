import person.Person

fun main(args:Array<String>) {
    println("ここでは名前を入力しません")
    val person1 : Person = Person()
    person1.printName()
    print("名前を入力してください：")
    val person2 : Person = Person(readLine()!!)
    person2.printName()
}

