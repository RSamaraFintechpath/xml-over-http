package com.fintech.asal.controllers;

import com.fintech.asal.services.ASALService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.fintech.asal.dtos.Note;

import javax.xml.bind.JAXBException;
import java.net.MalformedURLException;

@RestController
@RequestMapping("/ASAL")
public class ASALController {
    @Autowired
    ASALService service;
     @PostMapping("/marshal")
    public String marshal(@Validated @RequestBody Note jsonNote) throws JAXBException {
        service.marshal(jsonNote);
        return "Check console log";
    }
    @GetMapping("unmarshal")
    public Note unmarshal() throws MalformedURLException, JAXBException {
         return service.unmarshalFromURL();
    }
}
