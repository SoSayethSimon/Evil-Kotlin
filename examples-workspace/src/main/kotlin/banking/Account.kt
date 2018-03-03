package banking

/**
 * Created by Simon on 02.01.2018.
 */
interface Account {
    fun receiveMoney(amount: Long)
    fun giveMoney(amount: Long): Long
    fun showMoney(): Long
}