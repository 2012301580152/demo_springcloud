package whu.hydro.feignconsumer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import whu.hydro.feignconsumer.entity.User;
import whu.hydro.feignconsumer.server.HelloService;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author 86187
 * @Date 2019/1/19 11:29
 * @Version 1.0
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

//    @Autowired
//    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("DIDI")).append("\n");
        sb.append(helloService.hello("DIDI", 30)).append("\n");
        sb.append(helloService.hello(new User("DIDI", 30))).append("\n");
        return sb.toString();
    }


//    @RequestMapping(value = "feign-consumer3", method = RequestMethod.GET)
//    public String helloConsumer3() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(refactorHelloService.hello("MIMI")).append("\r\n");
//        sb.append(refactorHelloService.hello("MIMI", 20)).append("\r\n");
//        sb.append(refactorHelloService.hello(new whu.hydro.helloserviceapi.dto.User("DIDI", 30))).append("\r\n");
//        return sb.toString();
//    }




}
