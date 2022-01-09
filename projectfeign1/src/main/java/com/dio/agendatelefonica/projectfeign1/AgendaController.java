package com.dio.agendatelefonica.projectfeign1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @GetMapping
    public Contato retornarContato() {
        return Contato.builder()
                .id(1L)
                .nome("Me")
                .telefone("123-456")
                .build();
    }
}
