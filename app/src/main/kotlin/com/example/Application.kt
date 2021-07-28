package com.example

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*


fun Application.configureRouting() {

    install(CallLogging)

    routing {

        get("/") {
            call.respond("Hello World!")
        }

    }
}

object Config {
    lateinit var environment: ApplicationEnvironment

    fun init(environment: ApplicationEnvironment) {
        this.environment = environment
    }
}


@Suppress("unused")
fun Application.main() {
    Config.init(applicationEngineEnvironment { })
    configureRouting()
}

fun main(args: Array<String>): Unit = EngineMain.main(args)

