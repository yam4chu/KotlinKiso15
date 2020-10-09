package calculateSuper

open class CalculateSuper {
    protected var param1 = 0
    protected var param2 = 0

    constructor(param1: Int, param2: Int) {
        this.param1 = param1
        this.param2 = param2
    }

    open fun flow() {
        sum()
        sub()
    }

     fun sum() {
        println(param1.toString() + "と" + param2 + "足すと" + (param1 + param2))
    }

    protected fun sub() {
        println(param1.toString() + "と" + param2 + "引くと" + (param1 - param2))
    }
}