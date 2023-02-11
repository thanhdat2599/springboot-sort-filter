package com.datdt.sortfilterdemo.service.impl;


import com.datdt.sortfilterdemo.dto.CategoryDTO;
import com.datdt.sortfilterdemo.service.CategoryService;
import com.datdt.sortfilterdemo.data.CategoryData;
import com.datdt.sortfilterdemo.dto.SearchRequest;
import com.datdt.sortfilterdemo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryData categoryData;

    @Override
    public Page<CategoryDTO> searchCategory(SearchRequest request) {
        return categoryData.searchCategory(request);
    }
}
