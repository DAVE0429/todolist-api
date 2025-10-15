package com.api.study.dto.todo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTodoRequestDto {
    @Schema(description = "할일 내용", example = "우산 가져오기")
    private String content;
}
