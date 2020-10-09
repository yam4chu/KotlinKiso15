package calculateSuper

class CalculateChild(num1 : Int, num2 : Int) : CalculateSuper(num1, num2) {
    override fun flow() {
        sub()
        sum()
    }
}