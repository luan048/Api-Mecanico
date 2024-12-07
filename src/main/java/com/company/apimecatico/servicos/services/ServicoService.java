package com.company.apimecatico.servicos.services;

import com.company.apimecatico.servicos.models.ServiceModels;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServicoService {
    private static final Map<Long, ServiceModels> servicos = new HashMap<>();

    public List<ServiceModels> getAll() {
        return new ArrayList<>(servicos.values());
    }

    public ServiceModels getById(Long id) {
        return servicos.get(id);
    }

    /*Metodo criar vai criar um novoId, pela qnt atual + 1; vai criar recebendo id e os atributos*/
    public ServiceModels post(ServiceModels serviceModels) {
        Long proximoId = servicos.keySet().size() + 1L;
        serviceModels.setId(proximoId);
        servicos.put(proximoId, serviceModels);
        return serviceModels;
    }

    public ServiceModels put(Long id, ServiceModels serviceModels) {
        servicos.put(id, serviceModels);
        return serviceModels;
    }

    public String delete(Long id) {
        servicos.remove(id);
        return "Serviço Removido com Sucesso!";
    }
}
