package completed.outsider

/**
 * Created by Simon on 13.12.2017.
 */
class Outsider {

}

typealias Array = EvilOutsider

class EvilOutsider {
    private val innerArray: kotlin.Array<kotlin.String>

    constructor(length: Int, function: (Int) -> kotlin.String){
        innerArray = kotlin.Array(length,function)
    }

    fun forEach(function: (kotlin.String) -> Unit) {
        innerArray.forEach({e ->
            println("evil from outside!")
            function(e)
        })
    }
}