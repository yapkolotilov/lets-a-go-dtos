package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.*

@ApiModel("RoutePreviewDto: превью маршрута.")
data class RoutePreviewDto(
    @ApiModelProperty("Расстояние.")
    @JsonProperty("distance")
    val distance: Double,
    @ApiModelProperty("Продолжительность.")
    @JsonProperty("duration")
    val duration: Date,
    @ApiModelProperty("Скорость (км/ч).")
    @JsonProperty("speed")
    val speed: Double,
    @ApiModelProperty("Сожжёные килокалории.")
    @JsonProperty("caloriesBurnt")
    val kiloCaloriesBurnt: Int?,
    @ApiModelProperty("Перепад высот.")
    @JsonProperty("altitudeDelta")
    val altitudeDelta: Double,
    @ApiModelProperty("Тип.")
    @JsonProperty("type")
    val type: String,
    @ApiModelProperty("Сложность")
    @JsonProperty("difficulty")
    val difficulty: Int
)