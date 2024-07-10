package com.example.springboot.models.dtos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal price) {
    
}
