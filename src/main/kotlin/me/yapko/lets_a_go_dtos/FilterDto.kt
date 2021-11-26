package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.*
import javax.validation.constraints.Positive

@ApiModel("Фильтр.")
data class FilterDto(
    @Positive
    @ApiModelProperty("Минимальная длина маршрута (м).")
    @JsonProperty("min_length")
    val minLength: Double?,
    @Positive
    @ApiModelProperty("Максимальная длина маршрута (м).")
    @JsonProperty("max_length")
    val maxLength: Double?,
    @ApiModelProperty("Минимальная продолжительность маршрута")
    @JsonProperty("min_duration")
    val minDuration: Date?,
    @ApiModelProperty("Максимальная продолжительность маршрута")
    @JsonProperty("max_duration")
    val maxDuration: Date?,
    @ApiModelProperty("Разрешённые типы маршрутов")
    @JsonProperty("types_allowed")
    val typesAllowed: List<String>?,
    @ApiModelProperty("Разрешённые покрытия маршрутов.")
    @JsonProperty("grounds_allowed")
    val groundsAllowed: List<String>?,
    @ApiModelProperty("Включён ли фильтр.")
    @JsonProperty("enabled")
    val enabled: Boolean
)