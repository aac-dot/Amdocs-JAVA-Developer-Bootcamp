package com.dio.springboottest.springboottest;

import com.dio.springboottest.springboottest.controller.TesteController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {

    @Test
    public void testUnit() {
        TesteController controller = new TesteController();
        String resultado = controller.saudacao("DIO");

        assertEquals("Bem-vindo, DIO", resultado);
    }
}
