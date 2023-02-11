package com.datdt.sortfilterdemo.data.impl;

import com.datdt.sortfilterdemo.data.CategoryData;
import lombok.extern.slf4j.Slf4j;
import com.datdt.sortfilterdemo.dto.SearchRequest;
import com.datdt.sortfilterdemo.dto.SearchSpecification;
import com.datdt.sortfilterdemo.entity.Category;
import com.datdt.sortfilterdemo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CategoryDataImpl implements CategoryData {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Page<Category> searchCategory(SearchRequest request) {
        SearchSpecification<Category> specification = new SearchSpecification<>(request);
        Pageable pageable = SearchSpecification.getPageable(request.getPage(), request.getSize());
        return categoryRepository.findAll(specification, pageable);
    }
}
