package com.company.apimecatico.servicos.controllers;

import com.company.apimecatico.servicos.models.ServiceModels;
import com.company.apimecatico.servicos.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/servico", produces = MediaType.APPLICATION_JSON_VALUE) // Define rota e tudo no valor JSON
public class ServiceController {
    @Autowired
    private ServicoService servicoService;

    @GetMapping
    @ResponseBody
    public List<ServiceModels> getAll() {
        return servicoService.getAll();
    }

    @GetMapping("/{id}")
    public ServiceModels getById(@PathVariable("id") Long id) {
        return servicoService.getById((id));
    }

    @PostMapping
    @ResponseBody
    public ServiceModels post(@RequestBody ServiceModels serviceModels) {
        return servicoService.post(serviceModels);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public ServiceModels put(@PathVariable("id") Long id, @RequestBody ServiceModels serviceModels) {
        return servicoService.put(id, serviceModels);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        return servicoService.delete(id);
    }
}
