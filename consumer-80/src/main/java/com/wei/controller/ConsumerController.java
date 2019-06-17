package com.wei.controller;

import com.wei.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 为为
 * @create 6/17
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    private static final String url = "http://provider-user/";

    @RequestMapping(value = "consumer/user/add", method = RequestMethod.POST)
    public boolean add(@RequestBody User user) {
        return restTemplate.postForObject(url,user,Boolean.class);
    }

    @RequestMapping(value = "consumer/user/update", method = RequestMethod.POST)
    public boolean update(@RequestBody User user) {
        return restTemplate.postForObject(url,user,Boolean.class);
    }

    @RequestMapping(value = "consumer/user/list", method = RequestMethod.GET)
    public List<User> list() {
        return restTemplate.getForObject(url+"user/list",List.class);
    }

    @RequestMapping(value = "consumer/user/delete", method = RequestMethod.POST)
    public boolean delete(@RequestBody String id) {
        return restTemplate.postForObject(url,id,Boolean.class);
    }

    @RequestMapping(value = "consumer/user/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") String id) {
        return restTemplate.getForObject(url+"user/get/"+id,User.class);
    }
    @RequestMapping(value = "consumer/user/discovery", method = RequestMethod.GET)
    public Object discovery() {
        return restTemplate.getForObject(url+"user/discovery/",Object.class);
    }
}