package com.paulofilho.ioc_di;

import org.springframework.stereotype.Component;

@Component
public class MeuComponent {
    public String chamarComponent() {
        return "chamando meu component";
    }
}
