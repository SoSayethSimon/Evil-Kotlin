package completed.thread

import kotlin.concurrent.thread

class MyThread {
    fun initializeThreads(classLoader: ClassLoader) {
        thread(contextClassLoader = classLoader) {
            println("Thread started")
        }
        thread(contextClassLoader = classLoader) {
            println("Thread2 started")
        }
    }
}