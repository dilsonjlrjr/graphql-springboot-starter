package com.dilsonjlrjr.graphqlbackend.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Empresa {
    Long id;
    String cnpj;
    String nome;
}
