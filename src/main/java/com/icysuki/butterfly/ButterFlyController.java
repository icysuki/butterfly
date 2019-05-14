package com.icysuki.butterfly;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ButterFlyController {

    @GetMapping("/")
    public String butterfly() {
        return "Hello Butterfly!";
    }

}
