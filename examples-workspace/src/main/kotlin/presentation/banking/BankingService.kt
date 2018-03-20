package presentation.banking

/**
 * Created by Simon on 02.01.2018.
 */
class BankingService(
        private var accounts: MutableList<Account>
) {
    fun addAccount(account: Account) {
        accounts.add(account)
    }
    fun getAccounts(): List<Account> {
        return accounts
    }
    fun moveMoney(from: Account, to: Account, amount: Long){
        val available = from.giveMoney(amount)
        to.receiveMoney(available)
        println("Moved " + available)
    }
    fun showEntireMoney(): Long{
        return accounts.stream()
                .map { account -> account.showMoney() }
                .reduce({summe, active -> summe + active})
                .get()
    }
}