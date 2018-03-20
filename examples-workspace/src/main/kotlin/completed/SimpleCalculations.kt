package completed

/**
 * Created by Simon on 23.12.2017.
 */
class SimpleCalculations {
    fun calculate(): Int {
        val s1 = SpecialInt(7)
        val s2 = SpecialInt(5)
        return s1 - 4 + s1 + 4 + s2 - s2 result 0
    }
    class SpecialInt(value: Int) {
        val innerValue: Int = value

        operator fun minus(other: Int): SpecialInt {
            return SpecialInt(innerValue - other)
        }
        operator fun plus(other: Int): SpecialInt {
            return SpecialInt(innerValue - other)
        }

        fun toInt(): Int { return innerValue }

        infix fun result(other: Unit): Int {return toInt()}
    }

    operator fun SpecialInt.plus(other: SpecialInt): SpecialInt {
        return SpecialInt(innerValue + other.innerValue)
    }

    operator fun SpecialInt.minus(other: Int): SpecialInt {
        return SpecialInt(innerValue + other)
    }
}
operator fun SimpleCalculations.SpecialInt.minus(other: SimpleCalculations.SpecialInt): SimpleCalculations.SpecialInt {
    return SimpleCalculations.SpecialInt(innerValue + other.innerValue)
}

infix fun SimpleCalculations.SpecialInt.result(other: Int): Int {return 0}

infix fun ContractElement.add(other: ContractElement): Int {return 5}