package com.nanoAfrica.BasicCrud.Services;


import com.nanoAfrica.BasicCrud.Model.Course;
import com.nanoAfrica.BasicCrud.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    //get the repository instance
    @Autowired
    CourseRepository CourseRepository;

   /* private List<Course> Course =new ArrayList<>(Arrays.asList(
            new Course("1","Spring Boot","An opionated spring boot"),
            new Course("2","Spring Security","Lots of Security"),
            new Course("3","Spring Actuator","A log "))

    );*/

    public List<Course> getAllCourses(String topicId)
    {
        List<Course> Course = new ArrayList<>();
        CourseRepository.findByTopicId(topicId).forEach(Course::add);
        return Course;
    }
    public Course getCourse(String id)
    {
        //return Course.stream().filter(Course1 -> Course1.getId().equals(id)).findFirst().get();
        return CourseRepository.findById(id).get();
    }

    public void addCourse(Course Course)
    {
        CourseRepository.save(Course);
        //Course.add(Course);
    }

    public void updateCourse(Course Course, String id) {
       CourseRepository.save(Course);

    }

    public void deleteCourse(String id) {
        //Course.removeIf(t->t.equals(id));
        CourseRepository.deleteById(id);

    }
}
