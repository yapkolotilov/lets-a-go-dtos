package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("RoutePointDto: маршрут на карте")
data class RoutePointDto(
    @ApiModelProperty("Тип.")
    @JsonProperty("type")
    val type: String?,
    @ApiModelProperty("Стартовая точка.")
    @JsonProperty("start_point")
    val startPoint: PointDto,
    @ApiModelProperty("ID.")
    @JsonProperty("id")
    val id: Int
)