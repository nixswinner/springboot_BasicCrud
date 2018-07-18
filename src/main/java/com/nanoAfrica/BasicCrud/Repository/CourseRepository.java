package com.nanoAfrica.BasicCrud.Repository;


import com.nanoAfrica.BasicCrud.Model.Course;
import com.nanoAfrica.BasicCrud.Model.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    //implement the method use findBy --then property should be in camel case
public List<Course> findByTopicId(String topicId);

}
