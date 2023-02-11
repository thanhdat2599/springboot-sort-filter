package com.datdt.sortfilterdemo.data;

import com.datdt.sortfilterdemo.dto.SearchRequest;
import com.datdt.sortfilterdemo.entity.Category;
import org.springframework.data.domain.Page;

public interface CategoryData {
    Page<Category> searchCategory(SearchRequest request);
}
