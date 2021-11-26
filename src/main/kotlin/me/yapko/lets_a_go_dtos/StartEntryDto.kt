package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("StartEntryDto: Начать поход.")
data class StartEntryDto(
    @ApiModelProperty("ID маршрута.")
    @JsonProperty("id")
    val id: Int,
    @ApiModelProperty("Название маршрута.")
    @JsonProperty("name")
    val name: String?,
    @ApiModelProperty("Точки маршрута.")
    @JsonProperty("points")
    val points: List<PointDto>,
)