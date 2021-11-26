package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.*

@ApiModel("RouteItemDto: путь в списке.")
data class RouteItemDto(
    @ApiModelProperty("Название.")
    @JsonProperty("name")
    val name: String?,
    @ApiModelProperty("Тип.")
    @JsonProperty("type")
    val type: String?,
    @ApiModelProperty("Покрытие.")
    @JsonProperty("ground")
    val ground: String?,
    @ApiModelProperty("Длина.")
    @JsonProperty("distance")
    val distance: Double,
    @ApiModelProperty("Продолжительность.")
    @JsonProperty("duration")
    val duration: Date,
    @ApiModelProperty("Стартовая локация.")
    @JsonProperty("distance_to_route")
    val distanceToRoute: Double?,
    @ApiModelProperty("ID.")
    @JsonProperty("id")
    val id: Int
)