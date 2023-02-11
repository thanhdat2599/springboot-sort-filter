package com.datdt.sortfilterdemo.service;

import com.datdt.sortfilterdemo.dto.SearchRequest;
import com.datdt.sortfilterdemo.entity.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Page<Category> searchCategory(SearchRequest request);
}
