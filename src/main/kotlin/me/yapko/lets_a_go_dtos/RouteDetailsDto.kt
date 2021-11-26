package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.*

@ApiModel("RouteDetailsDto: Детали маршрута.")
class RouteDetailsDto(
    @ApiModelProperty("Название.")
    @JsonProperty("name")
    val name: String?,
    @JsonProperty("public")
    val public: Boolean,
    @ApiModelProperty("Расстояние.")
    @JsonProperty("distance")
    val distance: Double,
    @ApiModelProperty("Продолжительность.")
    @JsonProperty("duration")
    val duration: Date,
    @ApiModelProperty("Перепад высот.")
    @JsonProperty("altitude_delta")
    val altitudeDelta: Double,
    @ApiModelProperty("Средняя скорость.")
    @JsonProperty("speed")
    val speed: Double,
    @ApiModelProperty("Калорий сожжено.")
    @JsonProperty("kilocalories_burnt")
    val kilocaloriesBurnt: Int?,
    @ApiModelProperty("Сложность маршрута.")
    @JsonProperty("difficulty")
    val difficulty: Int?,
    @ApiModelProperty("Тип маршрута.")
    @JsonProperty("type")
    val type: String?,
    @ApiModelProperty("Покрытие маршрута.")
    @JsonProperty("ground")
    val ground: String?,
    @ApiModelProperty("Походы.")
    @JsonProperty("entries")
    val entries: List<EntryItemDto>,
    @ApiModelProperty("Свой ли маршрут.")
    @JsonProperty("mine")
    val mine: Boolean,
    @ApiModelProperty("Всего пройдено.")
    @JsonProperty("total_distance")
    val totalDistance: Double,
    @ApiModelProperty("Всего ккал сожжено.")
    @JsonProperty("total_calories_burnt")
    val totalCaloriesBurnt: Int?,
    @ApiModelProperty("ID")
    @JsonProperty("id")
    val id: Int,
)