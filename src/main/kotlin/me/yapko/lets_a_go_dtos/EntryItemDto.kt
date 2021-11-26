package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.*

@ApiModel("RouteEntryDto: Поход.")
data class EntryItemDto(
    @ApiModelProperty("Дата похода")
    @JsonProperty("date")
    val date: Date,
    @ApiModelProperty("Продолжительность.")
    @JsonProperty("duration")
    val duration: Date,
    @ApiModelProperty("Пройден ли маршрут.")
    @JsonProperty("passed")
    val passed: Boolean,
    @ApiModelProperty("ID маршрута.")
    @JsonProperty("route_id")
    val routeId: Int?,
    @ApiModelProperty("ID")
    @JsonProperty("id")
    val id: Int
)