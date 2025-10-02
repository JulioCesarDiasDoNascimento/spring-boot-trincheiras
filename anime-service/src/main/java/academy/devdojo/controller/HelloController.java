package academy.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // todos os métodos da classe serao tratados como controller.
public class HelloController {

    @GetMapping("/hi") // Uma url com barra e sem barra é diferente
    //pode fazer dessa forma de array (value = {"/hi", "/hi/"})
    public String hi() {
        return "OMAE WA MOU SHINDE IRU!";
    }
    
}
