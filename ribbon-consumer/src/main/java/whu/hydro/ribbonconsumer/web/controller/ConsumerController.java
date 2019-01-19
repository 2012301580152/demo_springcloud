package whu.hydro.ribbonconsumer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import whu.hydro.ribbonconsumer.server.HelloService;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author 86187
 * @Date 2019/1/18 17:30
 * @Version 1.0
 */
@RestController
public class ConsumerController {


    @Autowired
    HelloService helloService;


    @RequestMapping(value = "ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {

//        restTemplate.put();
        return helloService.helloService();
    }
}
