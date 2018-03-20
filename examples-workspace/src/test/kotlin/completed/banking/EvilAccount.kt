package completed.banking

import completed.banking.Account

/**
 * Created by Simon on 02.01.2018.
 */
class EvilAccount(private var money: Long): Account {
    override fun receiveMoney(amount: Long){
        //Steal 1 from the received amount
        money += amount - 1
    }
    override fun giveMoney(amount: Long): Long{
        return if(money - amount > 0) {
            money -= amount
            amount
        } else {
            val temp = money
            money = 0
            temp
        }
    }
    override fun showMoney(): Long {
        return money
    }
}