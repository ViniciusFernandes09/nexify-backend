package com.projects.nexify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projects.nexify.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

