package com.example

import com.typesafe.config.ConfigFactory
import io.ktor.application.*
import io.ktor.config.*
import io.ktor.server.testing.*
import kotlin.test.BeforeTest

abstract class ApplicationTest {
    protected lateinit var application: Application

    companion object {
        val engine = TestApplicationEngine(
            createTestEnvironment {
                config = HoconApplicationConfig(ConfigFactory.load("application.conf"))
            }
        )

    }


    @BeforeTest
    fun `Setup The Enging`() {
        println("Starting application with config ....")
        engine.start(wait = false)
    }

}