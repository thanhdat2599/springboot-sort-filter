package com.datdt.sortfilterdemo.data;

import com.datdt.sortfilterdemo.dto.CategoryDTO;
import com.datdt.sortfilterdemo.dto.SearchRequest;
import com.datdt.sortfilterdemo.entity.Category;
import org.springframework.data.domain.Page;

public interface CategoryData {
    Page<CategoryDTO> searchCategory(SearchRequest request);
}
