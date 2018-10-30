package completed

import completed.*
import io.kotlintest.specs.StringSpec

/**
 * Created by Simon on 23.12.2017.
 */
class ContractCalculationsTest : StringSpec() {
    init {
        "Seem's normal" {
            println((NormalContract() with SpecialInclusion() with NormalCommission() with SpecialDiscount() with NormalRate()).value)
        }
        "Still fine" {
            println((NormalContract() with NormalInclusion() with NormalDiscount()).value)
        }
        "Wait a minute..." {
            println((SpecialContract() with NormalDiscount() with NormalInclusion() with SpecialRate() with SpecialCommission()).value)
        }
        "...what are you doing?..." {
            println((NormalInclusion() with SpecialDiscount() with NormalContract() with SpecialRate()).value)
        }
        "...please stop, just stop!" {
            println((SpecialRate() with NormalDiscount() with NormalRate()).value)
        }
        "and a bonus" {
            println(SpecialRate() with Any())
        }
    }
}

class ForDecompilation {
    fun justToWriteDown(): Unit {
        println((NormalContract() with SpecialInclusion() with NormalCommission() with SpecialDiscount() with NormalRate()).value)
        println((NormalContract() with NormalInclusion() with NormalDiscount()).value)
        println((SpecialContract() with NormalDiscount() with NormalInclusion() with SpecialRate() with SpecialCommission()).value)
        println((NormalInclusion() with SpecialDiscount() with NormalContract() with SpecialRate()).value)
        println((SpecialRate() with NormalDiscount() with NormalRate()).value)
        println(SpecialRate() with Any())
    }
}