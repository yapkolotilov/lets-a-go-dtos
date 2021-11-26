package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("ErrorDto: Ошибка.")
data class ErrorDto(
    @ApiModelProperty("Код ошибки.")
    @JsonProperty("code")
    val code: String,
    @ApiModelProperty("Статус ошибки.")
    @JsonProperty("status")
    val status: Int,
    @ApiModelProperty("Сообщение об ощибке.")
    @JsonProperty("message")
    val message: String,
    @ApiModelProperty("Трассировка стека.")
    @JsonProperty("stackTrace")
    val stackTrace: String
)