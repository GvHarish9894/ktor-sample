package com.example.plugins

import com.example.sample_data.volunteerList
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/sample") {
            call.respond(
                status = HttpStatusCode.OK,
                message = volunteerList()
            )
        }
        post() {

        }
        put() {

        }
        delete() {

        }
    }
}
