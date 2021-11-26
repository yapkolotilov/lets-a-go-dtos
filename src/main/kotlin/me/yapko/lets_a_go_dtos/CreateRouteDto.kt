package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import javax.validation.constraints.NotEmpty

@ApiModel("CreateRouteDto: Создание маршрута.")
data class CreateRouteDto(
    @ApiModelProperty("Название.")
    @JsonProperty("name")
    val name: String?,
    @ApiModelProperty("Сложность.")
    @JsonProperty("difficulty")
    val difficulty: Int,
    @ApiModelProperty("Тип.")
    @JsonProperty("type")
    val type: String?,
    @ApiModelProperty("Тип покрытия.")
    @JsonProperty("ground")
    val ground: String?,
    @ApiModelProperty("Публиковать ли маршрут.")
    @JsonProperty("public")
    val isPublic: Boolean,
    @ApiModelProperty("Точки.")
    @JsonProperty("points")
    @NotEmpty
    val points: List<CreatePointDto>
)