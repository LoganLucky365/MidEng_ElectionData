package com.example.mideng_election_data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * In diesem Controller wird die REST Schnittstelle angegeben
 * @author Sebastian Profous
 * @version 22-10-2024
 */
@RestController
public class RestControllerTest {
    @GetMapping("/")
    public String mainPage(){
        return "Willkommen zu dieser Tollen SpringBoot Applikation!";
    }
}
