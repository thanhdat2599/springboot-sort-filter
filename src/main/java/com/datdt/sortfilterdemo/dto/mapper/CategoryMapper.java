package com.datdt.sortfilterdemo.dto.mapper;

import com.datdt.sortfilterdemo.entity.Category;
import com.datdt.sortfilterdemo.dto.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO entity2Dto(Category role);
}
