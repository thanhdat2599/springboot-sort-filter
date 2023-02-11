package com.datdt.sortfilterdemo.repository;

import com.datdt.sortfilterdemo.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>, CategoryCustomRepository, JpaSpecificationExecutor<Category> {
}
