package com.datdt.sortfilterdemo.service;

import com.datdt.sortfilterdemo.dto.CategoryDTO;
import com.datdt.sortfilterdemo.dto.SearchRequest;
import com.datdt.sortfilterdemo.entity.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Page<CategoryDTO> searchCategory(SearchRequest request);
}
