package com.dilsonjlrjr.graphqlbackend.service;

import com.dilsonjlrjr.graphqlbackend.factory.EmpresaFactory;
import com.dilsonjlrjr.graphqlbackend.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService implements IEmpresa {

    @Autowired
    EmpresaFactory factory;

    @Override
    public List<Empresa> findAll() {
        return factory.createListEmpresa();
    }
}
