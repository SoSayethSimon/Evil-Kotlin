import io.kotlintest.specs.StringSpec

/**
 * Created by Simon on 23.12.2017.
 */
class SimpleCalculationsTest: StringSpec() {
    init {
        "Let's see what it does" {
            println(SimpleCalculations().calculate())
        }
    }
}