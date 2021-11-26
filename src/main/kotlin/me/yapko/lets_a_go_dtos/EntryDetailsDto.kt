package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.*

@ApiModel("EntryDetailsDto: Поход.")
data class EntryDetailsDto(
    @ApiModelProperty("Закончен ли.")
    @JsonProperty("finished")
    val finished: Boolean,
    @ApiModelProperty("Дата.")
    @JsonProperty("date")
    val date: Date,
    @ApiModelProperty("Продолжительность.")
    @JsonProperty("duration")
    val duration: Date,
    @ApiModelProperty("Пройденное расстояние.")
    @JsonProperty("distance")
    val distance: Double,
    @ApiModelProperty("Перепад высот.")
    @JsonProperty("altitude_delta")
    val altitudeDelta: Double,
    @ApiModelProperty("Скорость.")
    @JsonProperty("speed")
    val speed: Double,
    @ApiModelProperty("Ккал сожжено.")
    @JsonProperty("kilocalories_burnt")
    val kiloCaloriesBurnt: Int?,
    @ApiModelProperty("ID маршрута.")
    @JsonProperty("route_id")
    val routeId: Int?,
    @ApiModelProperty("ID.")
    @JsonProperty("id")
    val id: Int
)