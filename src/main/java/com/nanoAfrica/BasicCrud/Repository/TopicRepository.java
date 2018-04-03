package com.nanoAfrica.BasicCrud.Repository;


import com.nanoAfrica.BasicCrud.Model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {
}
