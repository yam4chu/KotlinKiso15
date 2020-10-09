package person

class Person {
    private var name: String? = null

    constructor() {
        name = "名無し"
    }

    constructor(str : String) {
        name = str
    }


    fun printName() {
        println("私の名前は $name です")
    }
}