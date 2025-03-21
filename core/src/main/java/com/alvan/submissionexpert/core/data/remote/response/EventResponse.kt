package com.alvan.submissionexpert.core.data.remote.response

import com.google.gson.annotations.SerializedName

data class EventResponse(

    @field:SerializedName("listEvents")
    val listEvents: List<ListEventsItem> = listOf(),

    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String
)

data class ListEventsItem(

    @field:SerializedName("mediaCover")
    val mediaCover: String,

    @field:SerializedName("registrants")
    val registrants: Int,

    @field:SerializedName("link")
    val link: String,

    @field:SerializedName("description")
    val description: String,

    @field:SerializedName("quota")
    val quota: Int,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("beginTime")
    val beginTime: String,

)
