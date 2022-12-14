package br.com.jackson.sacolaapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String cep;
    private String complemento;
}
