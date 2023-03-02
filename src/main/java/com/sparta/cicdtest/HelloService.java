package com.sparta.cicdtest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class HelloService {
    private final HelloRepository helloRepository;

    @Transactional
    public String createHello(String content) {
        Test test = new Test(content);
        helloRepository.save(test);
        return test.getContent();
    }
}
