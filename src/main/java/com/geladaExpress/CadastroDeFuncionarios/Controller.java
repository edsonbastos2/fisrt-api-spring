package com.geladaExpress.CadastroDeFuncionarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/home")
    public String Boasvindas() {
        return "Boas vindas";
    }
}
