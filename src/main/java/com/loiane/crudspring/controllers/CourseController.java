package com.loiane.crudspring.controllers;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loiane.crudspring.models.Course;
import com.loiane.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

@Component
@RestController
@AllArgsConstructor
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }
}
