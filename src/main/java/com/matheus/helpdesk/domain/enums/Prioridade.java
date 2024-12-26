package com.matheus.helpdesk.domain.enums;

public enum Prioridade {

    BAIXA("BAIXA", 0), MEDIA("MEDIA", 1), ALTA("ALTA", 2);

    private Integer codigo;
    private String descricao;

    Prioridade(String descricao, Integer codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Prioridade toEnum(Integer cod){
        if (cod == null){
            return null;
        }
        for (Prioridade x : Prioridade.values()){
            if (cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalArgumentException("Prioridade inválido");
    }
}
