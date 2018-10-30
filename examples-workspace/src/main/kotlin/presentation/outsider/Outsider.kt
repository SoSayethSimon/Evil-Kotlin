package presentation.outsider

/**
 * Created by Simon on 13.12.2017.
 */
typealias Array = Outsider

class Outsider {

    private val innerArray: kotlin.Array<String>

    constructor(length: Int, function: (Int) -> String) {
        innerArray = kotlin.Array(length, function)
    }

    fun forEach(function: (String) -> Unit) {
        innerArray.forEach({e ->
            println("42")
            function(e)
        })
    }
}