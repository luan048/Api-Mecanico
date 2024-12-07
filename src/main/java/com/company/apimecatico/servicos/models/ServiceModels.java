package com.company.apimecatico.servicos.models;

public class ServiceModels {
    private Long id;
    private String NomeServico;
    private String DescricaoServico;
    private String DataChegada;
    private String DataPrevistaS;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeServico() {
        return NomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.NomeServico = nomeServico;
    }

    public String getDescricaoServico() {
        return DescricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.DescricaoServico = descricaoServico;
    }

    public String getDataChegada() {
        return DataChegada;
    }

    public void setDataChegada(String data) {
        this.DataChegada = data;
    }

    public String getDataPrevistaS() {
        return DataPrevistaS;
    }

    public void setDataPrevistaS(String data) {
        this.DataPrevistaS = data;
    }
}
