package com.zenjob.android.browsr.data

import com.squareup.moshi.Json
import java.io.Serializable
import java.util.Date

data class Show(
    val id: Long,
    val overview: String?,
    val title: String,
    @Json(name = "release_date") val releaseDate: Date?,
    @Json(name = "vote_average") val voteAverage: Float?,
    @Json(name = "poster_path") val posterPath: String? = null
) : Serializable
