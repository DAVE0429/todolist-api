package com.api.study.controller;

import com.api.study.dto.todo.CreateTodoRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name="할 일")
@RestController
@RequiredArgsConstructor
@RequestMapping("/_api/v1/todo")
public class TodoController {

    @Operation(summary = "할 일 - 할 일 생성")
    @PostMapping("")
    public ResponseEntity create(
            @RequestBody CreateTodoRequestDto createTodoRequestDto
            ){
        System.out.println("createTodoRequestDto.getContent()" + createTodoRequestDto.getContent());
        return ResponseEntity.ok().body(createTodoRequestDto);
    }

}
