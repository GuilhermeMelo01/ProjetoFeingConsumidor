package com.projetoonefeing2.projetoonefeing2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private ConsumidorApi consumidorApi;

    @GetMapping
    public Contato retornaContato(){
        return consumidorApi.retornaContato();
    }
}
