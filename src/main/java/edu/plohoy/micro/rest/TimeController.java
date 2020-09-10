package edu.plohoy.micro.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
public class TimeController {

    @GetMapping("/time")
    public String getTime() {
        return LocalDateTime.now().toString();
    }
}
