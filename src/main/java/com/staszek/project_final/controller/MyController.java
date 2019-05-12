package com.staszek.project_final.controller;

import com.staszek.project_final.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @Autowired
    EntryRepository entryRepository;
    @GetMapping("/wpis")
    String pokażWidok(){
        return "formularzWpisu";
    }
}
