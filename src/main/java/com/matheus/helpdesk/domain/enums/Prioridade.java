package com.matheus.helpdesk.domain.enums;

public enum Prioridade {

    BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");

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
