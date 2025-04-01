package com.viewd.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform