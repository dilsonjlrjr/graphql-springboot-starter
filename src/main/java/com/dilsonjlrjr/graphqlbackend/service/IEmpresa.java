package com.dilsonjlrjr.graphqlbackend.service;

import com.dilsonjlrjr.graphqlbackend.model.Empresa;

import java.util.List;

public interface IEmpresa {
    List<Empresa> findAll();
}
