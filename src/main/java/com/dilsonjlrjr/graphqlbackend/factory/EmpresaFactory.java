package com.dilsonjlrjr.graphqlbackend.factory;

import com.dilsonjlrjr.graphqlbackend.model.Empresa;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class EmpresaFactory {

    public List<Empresa> createListEmpresa() {
        return Arrays.asList(
                Empresa.builder().id(0L).cnpj("00000000000000000000").nome("Empresa A").build(),
                Empresa.builder().id(0L).cnpj("00000000000000000000").nome("Empresa B").build(),
                Empresa.builder().id(0L).cnpj("00000000000000000000").nome("Empresa C").build(),
                Empresa.builder().id(0L).cnpj("00000000000000000000").nome("Empresa D").build()
        );
    }
}
