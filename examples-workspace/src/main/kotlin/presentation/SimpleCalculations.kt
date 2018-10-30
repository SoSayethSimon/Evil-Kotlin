package presentation

/**
 * Created by Simon on 23.12.2017.
 */
class SimpleCalculations {
    fun calculate(): Int {
        val s1 = SpecialInt(7)
        val s2 = SpecialInt(5)
        return s1 - 4 + s1 + 4 + s2 - s2 + 0.2 result Unit
    }
    class SpecialInt(value: Int): Number() {
        override fun toChar(): Char {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toDouble(): Double {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toFloat(): Float {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toLong(): Long {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toShort(): Short {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toByte(): Byte {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        val innerValue: Int = value

        operator fun minus(other: Int): SpecialInt {
            return SpecialInt(innerValue - other)
        }
        operator fun plus(other: Int): SpecialInt {
            return SpecialInt(innerValue - other)
        }

        override fun toInt(): Int { return innerValue }

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

operator fun SimpleCalculations.SpecialInt.plus(other: Number): SimpleCalculations.SpecialInt {
    return SimpleCalculations.SpecialInt(innerValue - other.toInt() + 2)
}

infix fun SimpleCalculations.SpecialInt.result(other: Unit): Int {return 42}

infix fun ContractElement.with(other: Any): Int {return 5}