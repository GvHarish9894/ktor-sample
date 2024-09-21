package com.example.plugins

import com.example.sample_data.volunteerList
import com.example.sample_data.communityList
import com.example.sample_data.locationList
import com.example.sample_data.utilityList
import com.example.sample_data.cityList
import com.example.sample_data.articleList
import com.example.sample_data.helpLineList

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/volunteer_list") {
            call.respond(
                status = HttpStatusCode.OK,
                message = volunteerList
            )
        }
        get("/community_list") {
            call.respond(
                status = HttpStatusCode.OK,
                message = communityList
            )
        }
        get("/location_list") {
            call.respond(
                status = HttpStatusCode.OK,
                message = locationList
            )
        }
        get("/utility_list") {
            call.respond(
                status = HttpStatusCode.OK,
                message = utilityList
            )
        }
        get("/city_list") {
            call.respond(
                status = HttpStatusCode.OK,
                message = cityList
            )
        }
        get("/article_list") {
            call.respond(
                status = HttpStatusCode.OK,
                message = articleList
            )
        }
        get("/helpLine_list") {
            call.respond(
                status = HttpStatusCode.OK,
                message = helpLineList
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
