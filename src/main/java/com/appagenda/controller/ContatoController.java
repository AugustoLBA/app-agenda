package com.appagenda.controller;

import com.appagenda.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ContatoController {

    @Autowired
    private ContatoService service;
}
