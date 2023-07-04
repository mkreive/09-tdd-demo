package lt.javau5.testdemo.controller;

import lt.javau5.testdemo.entity.Thing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/thing")
    public Thing getThing() {
        return new Thing(1L, "");
    }


}
