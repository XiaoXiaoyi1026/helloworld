package xyx.xiaoxiaoyi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoxiaoyi
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("")
    public String helloWorld() {
        System.out.println("Hello world!");
        return "OK";
    }

}
