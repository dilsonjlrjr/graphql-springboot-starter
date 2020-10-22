package com.dilsonjlrjr.graphqlbackend.controller;

import com.dilsonjlrjr.graphqlbackend.model.Empresa;
import com.dilsonjlrjr.graphqlbackend.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<Empresa>> findAll() {
        return new ResponseEntity<>(empresaService.findAll(), HttpStatus.ACCEPTED);
    }
}
