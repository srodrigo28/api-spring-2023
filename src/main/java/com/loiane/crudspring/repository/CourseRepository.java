package com.loiane.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loiane.crudspring.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
