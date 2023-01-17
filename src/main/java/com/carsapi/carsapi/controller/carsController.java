package com.carsapi.carsapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.carsapi.dto.carsDTO;

@RestController
@RequestMapping("/cars")

public class carsController {

    @PostMapping
    public void imprimeBodyNoConsole(@RequestBody carsDTO req) {
        System.out.println(req);
        System.out.println(req.anoModelo());
        System.out.println(req.dataFabricacao());
        System.out.println(req.fabricante());
        System.out.println(req.valor());
        System.out.println(req.modelo());

    }


    
}
