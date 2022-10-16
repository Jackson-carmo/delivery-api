package br.com.jackson.sacolaapi.resources;

import br.com.jackson.sacolaapi.models.Item;
import br.com.jackson.sacolaapi.models.Sacola;
import br.com.jackson.sacolaapi.resources.dtos.ItemDto;
import br.com.jackson.sacolaapi.services.SacolaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sacola")
@RequiredArgsConstructor
public class SacolaResource {

    private final SacolaService service;

    @PostMapping
    public Item incluirItem(@RequestBody ItemDto itemDto ) {
        return service.incluirItem(itemDto);

    }

    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long id) {
        return service.verSacola(id);
    }

    @PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola fecharSacola(@PathVariable("sacolaId") Long sacolaId, @RequestParam("formaPagamento") int formaPagamento) {
        return service.fecharSacola(sacolaId, formaPagamento);
    }
}
