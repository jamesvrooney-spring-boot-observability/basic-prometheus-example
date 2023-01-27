package com.jamesvrooney.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @GetMapping("/something")
    public ResponseEntity<String> createLogs() {
        log.warn("Just checking");

        return ResponseEntity.ok().body("All Ok");
    }
}
