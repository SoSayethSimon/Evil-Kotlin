package completed.thread

import java.net.URL


typealias URLClassLoader = EvilClassLoader

class EvilClassLoader(): java.lang.ClassLoader() {
    init {
        println("I will destroy you!")
    }

    constructor(urls: Array<URL>) : this() {
    }
}