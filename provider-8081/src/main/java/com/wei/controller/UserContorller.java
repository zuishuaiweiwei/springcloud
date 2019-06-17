package com.wei.controller;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import com.wei.entity.User;
import com.wei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 为为
 * @create 6/17
 */
@RestController
public class UserContorller {

    @Autowired
    UserService userService;
    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "user/add",method = RequestMethod.POST)
    public boolean add(@RequestBody User user){
        return userService.add(user);
    }
    @RequestMapping(value = "user/update", method = RequestMethod.POST)
    public boolean update(@RequestBody User user){
        return userService.update(user);
    }
    @RequestMapping(value = "user/list",method = RequestMethod.GET)
    public List<User> list(){
        return userService.list();
    }
    @RequestMapping(value = "user/delete",method = RequestMethod.POST)
    public boolean delete(@RequestBody String id){
        return userService.delete(id);
    }

    @RequestMapping(value = "user/get/{id}",method = RequestMethod.GET)
    public User get(@PathVariable("id") String id){
        return userService.get(id);
    }

    @RequestMapping(value = "user/discovery/",method = RequestMethod.GET)
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for(String service : services){
            System.out.println(service);
        }
        List<ServiceInstance> list = discoveryClient.getInstances("provider-user");
        for(ServiceInstance server:list){
            System.out.println(server.getServiceId()+"---"+server.getHost()+"---"+server.getPort()+"---"+server.getUri());
        }
        return this.discoveryClient;
    }
}