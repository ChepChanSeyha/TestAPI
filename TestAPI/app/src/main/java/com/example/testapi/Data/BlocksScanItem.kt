package com.example.testapi.Data

import com.google.gson.annotations.SerializedName

data class BlocksScanItem(

	@field:SerializedName("distance")
	val distance: Double? = null,

	@field:SerializedName("avg_speed")
	val avgSpeed: Double? = null,

	@field:SerializedName("block")
	val block: List<List<Double?>?>? = null,

	@field:SerializedName("route_color")
	val routeColor: String? = null
)