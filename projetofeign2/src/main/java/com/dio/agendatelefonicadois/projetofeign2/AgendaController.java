package com.dio.agendatelefonicadois.projetofeign2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private ConsumerAPI consumindoAPI;

    @GetMapping
    public Contato retornarContato() {
        return consumindoAPI.retornarContato();
    }
}
