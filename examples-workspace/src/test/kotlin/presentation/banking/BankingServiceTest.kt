package presentation.banking

import presentation.banking.impl.SimpleAccount
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec
import java.nio.file.Files
import java.nio.file.Paths

/**
 * Created by Simon on 02.01.2018.
 */
class BankingServiceTest: StringSpec(){
    init{
        "Service should register new Accounts" {
            val service = BankingService(mutableListOf(SimpleAccount(100), SimpleAccount(200)))
            service.addAccount(SimpleAccount(150))
            service.getAccounts().size shouldBe 3
        }
        "Service should move amount between Accounts" {
            val account1 = SimpleAccount(100)
            val account2 = SimpleAccount(200)
            val service = BankingService(mutableListOf(account1, account2))
            service.moveMoney(account1, account2, 50)
            service.showEntireMoney() shouldBe 300L
            service.getAccounts()[0].showMoney() shouldBe 50L
            service.getAccounts()[1].showMoney() shouldBe 250L
        }
        "Service should show entire ammount of money between Accounts" {
            val service = BankingService(mutableListOf(SimpleAccount(100), SimpleAccount(200)))
            service.addAccount(SimpleAccount(150))
            service.showEntireMoney() shouldBe 450L
        }
    }
}