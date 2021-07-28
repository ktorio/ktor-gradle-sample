package com.example

import io.ktor.http.*
import kotlin.test.*
import io.ktor.server.testing.*

class RootPathTest : ApplicationTest() {


    @Test
    fun `Get Root`() {
        with(engine) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Hello World!", response.content)
            }

        }
    }
}