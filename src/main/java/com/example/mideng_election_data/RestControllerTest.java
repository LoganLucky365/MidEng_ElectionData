package com.example.mideng_election_data;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @RequestMapping(value="/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public WahlergebnisSim electionDataJSON() {
        return WahlSimulator.wahSimRechnen();
    }
    @RequestMapping(value="/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public WahlergebnisSim electionDataXML() {
        return WahlSimulator.wahSimRechnen();
    }

}
