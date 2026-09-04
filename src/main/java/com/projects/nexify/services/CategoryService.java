package com.projects.nexify.services;

import com.projects.nexify.dto.CategoryDTO;
import com.projects.nexify.dto.ProductMinDTO;
import com.projects.nexify.entities.Category;
import com.projects.nexify.entities.Product;
import com.projects.nexify.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;


    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map(CategoryDTO::new).toList();
    }
}