package br.com.jackson.sacolaapi.services.impl;

import br.com.jackson.sacolaapi.enumeration.FormaPagamento;
import br.com.jackson.sacolaapi.models.Item;
import br.com.jackson.sacolaapi.models.Sacola;
import br.com.jackson.sacolaapi.repositories.SacolaRepository;
import br.com.jackson.sacolaapi.resources.dtos.ItemDto;
import br.com.jackson.sacolaapi.services.SacolaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SacolaServiceImpl implements SacolaService {

    private final SacolaRepository sacolaRepository;
    @Override
    public Item incluirItem(ItemDto itemDto) {
        return null;
    }

    @Override
    public Sacola verSacola(Long id) {
        return sacolaRepository.findById(id).orElseThrow(
                () -> {
                    throw new RuntimeException("Essa Sacola não existe!");
                }
        );
    }

    @Override
    public Sacola fecharSacola(Long id, int formaPagamento) {
        Sacola sacola = verSacola(id);
        if (sacola.getItens().isEmpty()) {
            throw new RuntimeException("Inclua itens na sacola!");
        }

        FormaPagamento formaPagamento1 = formaPagamento == 0 ? FormaPagamento.DINHEIRO : FormaPagamento.MAQUINETA;

       sacola.setFormaPagamento(formaPagamento1);
       sacola.setFechada(true);
       return sacolaRepository.save(sacola);

    }
}
