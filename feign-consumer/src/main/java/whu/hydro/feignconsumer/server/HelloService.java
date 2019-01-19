package whu.hydro.feignconsumer.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import whu.hydro.feignconsumer.entity.User;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author 86187
 * @Date 2019/1/19 11:27
 * @Version 1.0
 */

@FeignClient("hello-service")
public interface HelloService {
    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
