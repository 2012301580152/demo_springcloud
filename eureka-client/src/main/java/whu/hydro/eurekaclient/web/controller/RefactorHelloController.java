//package whu.hydro.eurekaclient.web.controller;
//
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import whu.hydro.helloserviceapi.dto.User;
//import whu.hydro.helloserviceapi.service.HelloService;
//
///**
// * @ClassName RefactorHelloController
// * @Description TODO
// * @Author 86187
// * @Date 2019/1/19 13:24
// * @Version 1.0
// */
//@RestController
//public class RefactorHelloController implements HelloService {
//    @Override
//    public String hello(@RequestParam("name") String name) {
//        return "Hello" + name;
//    }
//
//    @Override
//    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
//        return new User(name, age);
//    }
//
//    @Override
//    public String hello(User user) {
//        return "Hello" + user.getName() + ", " + user.getAge();
//    }
//}
