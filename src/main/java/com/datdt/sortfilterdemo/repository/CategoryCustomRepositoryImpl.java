package com.datdt.sortfilterdemo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CategoryCustomRepositoryImpl implements CategoryCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;
}
