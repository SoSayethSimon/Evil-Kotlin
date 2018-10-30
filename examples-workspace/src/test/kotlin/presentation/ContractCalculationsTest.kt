package presentation

import io.kotlintest.specs.StringSpec

class ContractCalculationsTest: StringSpec() {
    init {
        "Seem's normal" {
            println((NormalContract() with SpecialInclusion() with NormalCommission() with SpecialDiscount() with NormalRate()).value)
        }
        "Still fine" {
            println((NormalContract() with NormalInclusion() with NormalDiscount()).value)
        }
        "Wait a minute..." {
            println((SpecialContract() with NormalDiscount() with NormalInclusion() with SpecialRate() with NormalCommission()).value)
        }
        "... what are you doing?..." {
            println((NormalInclusion() with SpecialDiscount() with NormalContract() with SpecialRate()).value)
        }
        "please stop, just stop" {
            println((SpecialRate() with NormalDiscount() with NormalRate()).value)
        }
        "and a bonus" {
            println(SpecialRate() with Any())
        }
    }
}