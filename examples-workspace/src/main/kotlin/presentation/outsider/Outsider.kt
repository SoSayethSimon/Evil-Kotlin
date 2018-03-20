package presentation.outsider

/**
 * Created by Simon on 13.12.2017.
 */
class Outsider {

    private val innerArray: kotlin.Array<String>

    constructor(length: Int, function: (Int) -> String) {
        innerArray = kotlin.Array(length, function)
    }

    fun forEach(function: (String) -> Unit) {
        innerArray.forEach({e ->
            function(e)
        })
    }
}