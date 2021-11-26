package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.*
import javax.validation.constraints.NotEmpty

@ApiModel("PersonalHealthDto: Данные о здоровье пользователя.")
data class EditDetailsDto(
    @ApiModelProperty("ФИО.")
    @JsonProperty("name")
    @NotEmpty
    val name: String?,

    @ApiModelProperty("Возраст.")
    @JsonProperty("birthDate")
    val birthDate: Date?,

    @ApiModelProperty("Рост (см).")
    @JsonProperty("height")
    val height: Int?,

    @ApiModelProperty("Вес (кг).")
    @JsonProperty("weight")
    val weight: Int?,

    @ApiModelProperty("Заболевания (названия).")
    @JsonProperty("illnesses")
    val illnesses: List<String>?,

    @ApiModelProperty("Симптомы (названия).")
    @JsonProperty("symptoms")
    val symptoms: List<String>?,

    @ApiModelProperty("Фильтр.")
    @JsonProperty("filter")
    val filter: FilterDto?,

    @ApiModelProperty("Обновлять ли фильтр.")
    @JsonProperty("update_filter")
    val updateFilter: Boolean
)