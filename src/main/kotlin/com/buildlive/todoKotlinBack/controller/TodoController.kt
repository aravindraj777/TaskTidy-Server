package com.buildlive.todoKotlinBack.controller

import com.buildlive.todoKotlinBack.dto.TodoDTO
import com.buildlive.todoKotlinBack.model.Todo
import com.buildlive.todoKotlinBack.repository.ITodoRepository
import com.buildlive.todoKotlinBack.utils.ULIDGenerator
import org.springframework.beans.BeanUtils
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/todo")
class TodoController(private val todoRepository: ITodoRepository) {


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTodo(@RequestBody todoDTO: TodoDTO):Todo{
        println(todoDTO)
        val todo = Todo(
            id = ULIDGenerator.generate(), // ULID will be generated automatically in the entity constructor
            title = todoDTO.title, // These fields will be replaced using BeanUtils
            createdAt = todoDTO.createdAt,
            isCompleted = false // Temporary defaults to enable BeanUtils.copyProperties
        )
//        BeanUtils.copyProperties(todoDTO,todo)
        return todoRepository.save(todo)
    }

}