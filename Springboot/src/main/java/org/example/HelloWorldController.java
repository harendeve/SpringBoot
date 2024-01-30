package org.example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/harene") public String helloworld()
    {
        return "first spring boot";
    }
    @RequestMapping("/deve") public String helloworld1()
    {
        return "second spring boot";
    }
}
