package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/sample") {
            call.respond("{\"menu\": {\n" +
                    "  \"id\": \"file\",\n" +
                    "  \"value\": \"File\",\n" +
                    "  \"popup\": {\n" +
                    "    \"menuitem\": [\n" +
                    "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" +
                    "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" +
                    "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" +
                    "    ]\n" +
                    "  }\n" +
                    "}}")
        }
        post() {

        }
        put() {

        }
        delete() {

        }
    }
}
