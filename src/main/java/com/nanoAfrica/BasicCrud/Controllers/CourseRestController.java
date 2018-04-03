package com.nanoAfrica.BasicCrud.Controllers;


import com.nanoAfrica.BasicCrud.Model.Course;
import com.nanoAfrica.BasicCrud.Model.Topic;
import com.nanoAfrica.BasicCrud.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseRestController {

    @Autowired
    private CourseService CourseService;

    @GetMapping(value = "/")
    public String hello()
    {
        return "Hello from Spring";
    }

    @GetMapping(value = "/topics/{id}/courses")
    public List<Course>  Courses(@PathVariable String  id)
    {
        return CourseService.getAllCourses(id);
    }

    @GetMapping(value = "/topics/{topicID}/course/{id}")
    public Course getCourse(@PathVariable  String id)
    {
        return CourseService.getCourse(id);
    }

    @PostMapping(value = "/topics/{topicId}/course")
    public void addCourse(@RequestBody Course courses,
                          @PathVariable String topicId)
    {
        courses.setTopic(new Topic(topicId,"",""));
        CourseService.addCourse(courses);
    }
    @PutMapping(value ="/topics/{topicId}/course/{id}")
    public void update(@RequestBody Course courses,
                       @PathVariable String topicId,
                       @PathVariable String id)
    {
        courses.setTopic(new Topic(topicId,"",""));
        CourseService.updateCourse(courses,id);
    }

    @DeleteMapping(value = "/topics/{topicId}/course/{id}")
    public void deleteCourse(@PathVariable String id)
    {
         CourseService.deleteCourse(id);
    }

}
