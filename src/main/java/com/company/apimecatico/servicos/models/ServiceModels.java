package com.company.apimecatico.servicos.models;

public class ServiceModels {
    private Long id;
    private String nomeServico;
    private String descricaoServico;
    private String dataChegada;
    private String dataPrevistaS;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String data) {
        this.dataChegada = data;
    }

    public String getDataPrevistaS() {
        return dataPrevistaS;
    }

    public void setDataPrevistaS(String data) {
        this.dataPrevistaS = data;
    }
}
