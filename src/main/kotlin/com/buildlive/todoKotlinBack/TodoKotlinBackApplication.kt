package com.buildlive.todoKotlinBack

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoKotlinBackApplication

fun main(args: Array<String>) {
	runApplication<TodoKotlinBackApplication>(*args)
}
