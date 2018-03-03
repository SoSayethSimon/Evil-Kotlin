package outsider

import io.kotlintest.specs.StringSpec

/**
 * Created by Simon on 13.12.2017.
 */

class FromOutside: StringSpec() {
    init {
        "Destroyed by Evil Outsider" {
            val array = Array(5, { i -> (i * i).toString() })
            array.forEach({s -> println(s)})
        }
    }
}