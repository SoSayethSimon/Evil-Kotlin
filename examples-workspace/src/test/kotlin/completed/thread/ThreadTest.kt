package completed.thread

import io.kotlintest.specs.StringSpec
import java.net.URL

class ThreadTest : StringSpec() {
    init {
        "Executing the Threads" {
            MyThread().initializeThreads(URLClassLoader(Array(0) { i -> URL(i.toString()) }))
        }
    }
}
