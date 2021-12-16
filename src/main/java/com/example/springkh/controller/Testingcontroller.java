package com.example.springkh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//http://localhost:8072/
@RequestMapping("/api")
//http://localhost:8072/api
public class Testingcontroller {
    //http://localhost:8072/api/name
    @GetMapping("/name")
    public String getname() {
        return "omar saeed ";
    }
//localhost:8072/api/age
        @GetMapping("/age")
        public String getage () {
            return "21 ";
        }
    //localhost:8072/api/address
    @GetMapping("/address")
    public String getaddress () {
        return "badr ";
    }


    }
