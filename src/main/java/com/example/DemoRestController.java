package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @RequestMapping("/rest")
    public String rest() {
        return "REST works!<br/><a href='/servlet'>Servlet</a><br/><a href='/'>Vaadin</a>";
    }

}
