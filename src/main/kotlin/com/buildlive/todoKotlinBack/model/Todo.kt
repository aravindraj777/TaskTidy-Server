package com.buildlive.todoKotlinBack.model

import com.buildlive.todoKotlinBack.utils.ULIDGenerator
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.PrePersist
import lombok.NoArgsConstructor
import java.time.LocalDateTime

@Entity
data class Todo(

    @Id
    var id: String? = null,
    val title:String,
    val createdAt:LocalDateTime,
    val isCompleted:Boolean
){

    
    @PrePersist
    fun ensureId() {
        if (id == null) {
            id = ULIDGenerator.generate()
        }
    }
}
