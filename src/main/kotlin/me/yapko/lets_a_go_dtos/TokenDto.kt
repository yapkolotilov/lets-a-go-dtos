package me.yapko.lets_a_go_dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModelProperty

data class TokenDto(
    @ApiModelProperty("Токен")
    @JsonProperty("token")
    val token: String
)
