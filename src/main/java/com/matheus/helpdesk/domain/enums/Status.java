package com.matheus.helpdesk.domain.enums;

public enum Status {

    ABERTO("ABERTO", 0), ANDAMENTO("ANDAMENTO", 1), ENCERRADO("ENCERRADO", 2);

    private Integer codigo;
    private String descricao;

    Status(String descricao, Integer codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Status toEnum(Integer cod){
        if (cod == null){
            return null;
        }
        for (Status x : Status.values()){
            if (cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }
}
