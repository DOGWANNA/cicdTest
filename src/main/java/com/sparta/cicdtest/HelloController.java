package com.sparta.cicdtest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class HelloController {
    private final HelloService helloService;
    @GetMapping("/")
    public String getHello() {return "Hello World Push!!!";}

    @PostMapping("/")
    public String createHello(@RequestBody String content) {
        return helloService.createHello(content);
    }
}
