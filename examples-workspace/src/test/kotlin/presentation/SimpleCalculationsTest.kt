package presentation

import io.kotlintest.specs.StringSpec

class SimpleCalculationsTest: StringSpec() {
    init{
        "Let's see what it does" {
            println(SimpleCalculations().calculate())
        }
    }
}