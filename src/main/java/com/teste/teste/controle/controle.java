package com.teste.teste.controle;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controle {
    
    @GetMapping
    public String teste(){        
        return "teste";
    }
}
