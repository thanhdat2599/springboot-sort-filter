package com.datdt.sortfilterdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    private Long id;
    private String code;
    private String name;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
