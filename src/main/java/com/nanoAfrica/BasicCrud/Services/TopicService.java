package com.nanoAfrica.BasicCrud.Services;


import com.nanoAfrica.BasicCrud.Model.Topic;
import com.nanoAfrica.BasicCrud.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    //get the repository instance
    @Autowired
    TopicRepository topicRepository;

   /* private List<Topic> topics =new ArrayList<>(Arrays.asList(
            new Topic("1","Spring Boot","An opionated spring boot"),
            new Topic("2","Spring Security","Lots of Security"),
            new Topic("3","Spring Actuator","A log "))

    );*/

    public List<Topic> getAllTopics()
    {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    public Topic getTopic(String id)
    {
        //return topics.stream().filter(topics1 -> topics1.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic)
    {
        topicRepository.save(topic);
        //topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
       topicRepository.save(topic);

    }

    public void deleteTopic(String id) {
        //topics.removeIf(t->t.equals(id));
        topicRepository.deleteById(id);

    }
}
