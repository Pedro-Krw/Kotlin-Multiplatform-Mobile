package com.pedro.multiplatformmobile

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}