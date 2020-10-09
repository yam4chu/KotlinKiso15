import calculateSuper.CalculateChild
import calculateSuper.CalculateSuper

fun main(args:Array<String>) {
    val cs : CalculateSuper = CalculateSuper(5, 3)
    val cc = CalculateChild(10,7)
    cs.flow()
    cc.flow()
}

