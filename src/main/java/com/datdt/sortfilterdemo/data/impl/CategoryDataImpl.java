package com.datdt.sortfilterdemo.data.impl;

import com.datdt.sortfilterdemo.data.CategoryData;
import com.datdt.sortfilterdemo.dto.CategoryDTO;
import com.datdt.sortfilterdemo.dto.mapper.CategoryMapper;
import lombok.extern.slf4j.Slf4j;
import com.datdt.sortfilterdemo.dto.SearchRequest;
import com.datdt.sortfilterdemo.dto.SearchSpecification;
import com.datdt.sortfilterdemo.entity.Category;
import com.datdt.sortfilterdemo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Slf4j
@Service
public class CategoryDataImpl implements CategoryData {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Page<CategoryDTO> searchCategory(SearchRequest request) {
        SearchSpecification<Category> specification = new SearchSpecification<>(request);
        Pageable pageable = SearchSpecification.getPageable(request.getPage(), request.getSize());
        Page<Category> entities = categoryRepository.findAll(specification, pageable);
        Page<CategoryDTO> dtoPage = entities.map(new Function<Category, CategoryDTO>() {
            @Override
            public CategoryDTO apply(Category entity) {
                return CategoryMapper.INSTANCE.entity2Dto(entity);
            }
        });
        return dtoPage;
    }
}
