package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("CreateEntryDto: Создание прохода.")
data class CreateEntryDto(
    @ApiModelProperty("Точки.")
    @JsonProperty("points")
    val points: List<CreatePointDto>
)
