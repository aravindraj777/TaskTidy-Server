package com.buildlive.todoKotlinBack.repository

import com.buildlive.todoKotlinBack.model.Todo
import com.github.f4b6a3.ulid.Ulid
import org.springframework.data.jpa.repository.JpaRepository

interface ITodoRepository: JpaRepository<Todo,String> {
}