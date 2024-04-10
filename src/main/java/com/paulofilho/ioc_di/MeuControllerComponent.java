package com.paulofilho.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class MeuControllerComponent {

    @Autowired
    MeuComponent meuComponent;

    @GetMapping("/")
    public String getComponent() {
        var myComponent = new MeuComponent();
        var result = myComponent.chamarComponent();
        return result;
    }
}
