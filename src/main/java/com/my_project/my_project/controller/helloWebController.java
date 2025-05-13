package com.my_project.my_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



//decorados (carcteristicas automaticas agregar dontro del proyecto)
//se definen con @controller


//web controller se convierte en un servicio web

@Controller
public class helloWebController {
    //utilizamos siempre el protocolo http (get, put, post, delete)

    //request and response, peticiones y envios de datos al servidor por http
    @RequestMapping("/helloweb")
    public String helloHandler(){
        return "hola.html";
    }
}
