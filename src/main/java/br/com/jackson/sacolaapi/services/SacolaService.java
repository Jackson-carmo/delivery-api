package br.com.jackson.sacolaapi.services;

import br.com.jackson.sacolaapi.models.Item;
import br.com.jackson.sacolaapi.models.Sacola;
import br.com.jackson.sacolaapi.resources.dtos.ItemDto;

public interface SacolaService {

    Item incluirItem(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
