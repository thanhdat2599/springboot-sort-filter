package com.datdt.sortfilterdemo.controller;

import com.datdt.sortfilterdemo.dto.CategoryDTO;
import com.datdt.sortfilterdemo.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import com.datdt.sortfilterdemo.dto.SearchRequest;
import com.datdt.sortfilterdemo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/category", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/search")
    public ResponseEntity<Page<CategoryDTO>> search(@RequestBody SearchRequest request) {
        return ResponseEntity.ok(categoryService.searchCategory(request));
    }
}
