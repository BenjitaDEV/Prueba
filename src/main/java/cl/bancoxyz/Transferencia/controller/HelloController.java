package cl.bancoxyz.Transferencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola Mundo!";
    }

    @GetMapping("/alo")
    public String alo(){
        return "Holaxupalo";
    }

}
