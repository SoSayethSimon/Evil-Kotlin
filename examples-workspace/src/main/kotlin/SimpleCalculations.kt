/**
 * Created by Simon on 23.12.2017.
 */
class SimpleCalculations {
    fun calculate(): Int {
        val s1 = SpecialInt(2)
        return s1 - 4 + s1 - s1 result Unit
    }
    class SpecialInt(value: Int) {
        val innerValue: Int = value

        operator fun minus(other: Int): SpecialInt{
            return SpecialInt(innerValue - other)
        }
        operator fun plus(other: Int): SpecialInt {
            return SpecialInt(innerValue - other)
        }

        fun toInt(): Int { return innerValue }

        infix fun result(other: Unit): Int {return toInt()}
    }

    operator fun SpecialInt.plus(other: SimpleCalculations.SpecialInt): SpecialInt{
        return SpecialInt(innerValue + other.innerValue)
    }

    operator fun SpecialInt.minus(other: Int): SpecialInt {
        return SpecialInt(innerValue + other)
    }
}
operator fun SimpleCalculations.SpecialInt.minus(other: SimpleCalculations.SpecialInt): SimpleCalculations.SpecialInt {
    return SimpleCalculations.SpecialInt(innerValue + other.innerValue)
}

infix fun SimpleCalculations.SpecialInt.result(other: Unit): Int {return 0}