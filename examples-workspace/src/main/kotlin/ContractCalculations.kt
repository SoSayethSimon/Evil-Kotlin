import org.jetbrains.annotations.Contract

/**
 * Created by Simon on 23.12.2017.
 */
class ContractCalculations {

}

open class ContractElement(val value: Double) {
    open infix fun with(other: ContractElement): ContractElement {
        return ContractElement(value + other.value)
    }
    open infix fun with(other: Rate): ContractElement {
        return ContractElement(value * other.value)
    }
    open infix fun with(other: Discount): ContractElement {
        return ContractElement(value - value * other.value)
    }
}

class NormalContract(): ContractElement(10000.0) {}
class SpecialContract(): ContractElement(13000.0) {}

open class Rate(value: Double): ContractElement(value){
//    override infix fun with(other: ContractElement): ContractElement {
//        return ContractElement(value * other.value)
//    }
}
class NormalRate(): Rate(0.05) {}
class SpecialRate(): Rate(0.08) {}

class NormalInclusion(): ContractElement(1000.0) {}
class SpecialInclusion(): ContractElement(1500.0) {}

class NormalCommission(): ContractElement(1000.0) {}
class SpecialCommission(): ContractElement(1000.0) {}

open class Discount(value: Double): ContractElement(value){
//    override infix fun with(other: ContractElement): ContractElement {
//        return ContractElement(other.value - value * other.value)
//    }
}
class NormalDiscount(): Discount(0.10) {}
class SpecialDiscount(): Discount(0.15) {}
