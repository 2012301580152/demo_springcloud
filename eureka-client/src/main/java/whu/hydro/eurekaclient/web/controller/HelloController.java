package whu.hydro.eurekaclient.web.controller;

import com.netflix.appinfo.InstanceInfo.InstanceStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.*;
import whu.hydro.eurekaclient.entity.User;

import java.util.List;
import java.util.Random;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 86187
 * @Date 2019/1/18 16:48
 * @Version 1.0
 */
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(getClass());



    @Autowired
    private DiscoveryClient client;

    @Value("${spring.application.name}")
    private String appName;




    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() throws Exception {

        List<ServiceInstance> list = client.getInstances(appName);

        int sleepTime = new Random().nextInt(1000);
        logger.info("sleepTime: " + sleepTime);

//        Thread.sleep(sleepTime);



        logger.info("/hello, host:" + " " + ", service_id:");

        return "hello world, this host is: " + list.get(0).getHost() + " and this application id is: " +
                list.get(0).getInstanceId() + "sleepTime: " + sleepTime;
    }


    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {

        return "Hello" + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {

        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user) {

        return "Hello" + user.getName() + ", " + user.getAge();
    }


}
