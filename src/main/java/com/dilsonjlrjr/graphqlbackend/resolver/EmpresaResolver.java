package com.dilsonjlrjr.graphqlbackend.resolver;

import com.dilsonjlrjr.graphqlbackend.model.Empresa;
import com.dilsonjlrjr.graphqlbackend.service.EmpresaService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class EmpresaResolver implements GraphQLQueryResolver {

    @Autowired
    EmpresaService empresaService;

    public List<Empresa> findAll() {
        return empresaService.findAll();
    }
}
