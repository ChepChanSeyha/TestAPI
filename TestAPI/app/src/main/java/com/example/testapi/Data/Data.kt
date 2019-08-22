package com.example.testapi.Data

import com.google.gson.annotations.SerializedName

data class Data(

	@field:SerializedName("duration")
	val duration: Double? = null,

	@field:SerializedName("route")
	val route: List<List<Double?>?>? = null,

	@field:SerializedName("distance")
	val distance: Double? = null,

	@field:SerializedName("blocks_scan")
	val blocksScan: List<BlocksScanItem?>? = null,

	@field:SerializedName("point1")
	val point1: List<Double?>? = null,

	@field:SerializedName("point2")
	val point2: List<Double?>? = null
)