package com.my_project.my_project;

import org.springframework.web.bind.annotation.GetMapping;

public class helloRestController {
    @GetMapping("/hellorest")
    public String helloWorld(){
        //datos desde una bd
        //lista array
        //mensaje en json o xml
        return "Hola mundo desde uan clase";
    }
    
}
