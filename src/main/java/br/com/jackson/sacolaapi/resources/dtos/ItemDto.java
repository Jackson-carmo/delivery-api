package br.com.jackson.sacolaapi.resources.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {

    private Long produtoId;
    private int quantidade;
    private Long sacolaId;
}
