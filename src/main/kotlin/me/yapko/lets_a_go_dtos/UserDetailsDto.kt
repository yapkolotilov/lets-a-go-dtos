package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.*

@ApiModel("UserDetailsDto: Данные о пользователе")
data class UserDetailsDto(
    @ApiModelProperty("Имя пользователя.")
    @JsonProperty("username")
    val username: String,
    @ApiModelProperty("ФИО")
    @JsonProperty("name")
    val name: String?,
    @ApiModelProperty("Возраст.")
    @JsonProperty("age")
    val age: Int?,
    @ApiModelProperty("Дата рождения.")
    @JsonProperty("birthDate")
    val birthDate: Date?,
    @ApiModelProperty("Рост.")
    @JsonProperty("height")
    val height: Int?,
    @ApiModelProperty("Вес.")
    @JsonProperty("weight")
    val weight: Int?,
    @ApiModelProperty("Болезни.")
    @JsonProperty("illnesses")
    val illnesses: List<String>,
    @ApiModelProperty("Симптомы.")
    @JsonProperty("symptoms")
    val symptoms: List<String>,
    @ApiModelProperty("Фильтр")
    @JsonProperty("filter")
    val filter: FilterDto,
    @ApiModelProperty("Всего расстояния пройдено.")
    @JsonProperty("total_distance")
    val totalDistance: Double,
    @ApiModelProperty("Всего калорий сожжено.")
    @JsonProperty("total_calories_burnt")
    val totalKilocaloriesBurnt: Int?,
    @ApiModelProperty("Маршруты.")
    @JsonProperty("routes")
    val routes: List<RouteItemDto>,
    @ApiModelProperty("Походы.")
    @JsonProperty("entries")
    val entries: List<EntryItemDto>,
)