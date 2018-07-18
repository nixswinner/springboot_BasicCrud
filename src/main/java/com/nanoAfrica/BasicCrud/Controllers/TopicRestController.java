package com.nanoAfrica.BasicCrud.Controllers;


import com.nanoAfrica.BasicCrud.Model.Topic;
import com.nanoAfrica.BasicCrud.Services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicRestController {

    @Autowired
    private TopicService topicService;

   /* @GetMapping(value = "/")
    public String hello()
    {
        return "Hello from Spring";
    }*/

     @GetMapping(value = "/africastalking")
    public String hello()
    {
        //AfricasTalking.initialize(USERNAME, API_KEY);
        return "Hello from Spring";
    }

    @GetMapping(value = "/topics")
    public List<Topic>  topics()
    {
        return topicService.getAllTopics();
    }

    @GetMapping(value = "/topic/{id}")
    public Topic getTopic(@PathVariable  String id)
    {
        return topicService.getTopic(id);
    }

    @PostMapping(value = "/topic")
    public void addTopic(@RequestBody Topic topics)
    {
        topicService.addTopic(topics);
    }
    @PutMapping(value = "/topic/{id}")
    public void update(@RequestBody Topic topic, @PathVariable String id)
    {
        topicService.updateTopic(topic,id);
    }

    @DeleteMapping(value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }

}
