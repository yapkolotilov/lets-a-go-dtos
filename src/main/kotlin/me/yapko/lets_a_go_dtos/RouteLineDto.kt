package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("RouteLineDto: Маршрут на карте.")
data class RouteLineDto(
    @ApiModelProperty("Тип.")
    @JsonProperty("type")
    val type: String?,
    @ApiModelProperty("Точки.")
    @JsonProperty("points")
    val points: List<PointDto>,
    @ApiModelProperty("ID")
    @JsonProperty("id")
    val id: Int,
)