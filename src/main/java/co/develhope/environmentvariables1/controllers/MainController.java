package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    // ESERCIZIO Deploy - Environments Variables 01
    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String getMessage(){
        String var = environment.getProperty("authCode");
        String varTwo = environment.getProperty("devName");
        return "Benvenuto " + var + " il tuo authcode è: " + varTwo;
    }

    // ESERCIZIO Deploy - Environments Variables 02

    @GetMapping("/test")
    public String getMessageTest(){
        String var = environment.getProperty("welcomeMsg2");
        return var;
    }

    @GetMapping("/prod")
    public String getMessageProd(){
        String var = environment.getProperty("welcomeMsg");
        return var;
    }
}