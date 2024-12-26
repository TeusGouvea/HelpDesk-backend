package com.matheus.helpdesk.domain.enums;

public enum Perfil {

    ADMIN("ROLE_ADMIN", 0), CLIENTE("ROLE_CLIENTE", 1), TECNICO("ROLE_TECNICO", 2);

    private Integer codigo;
    private String descricao;

    Perfil(String descricao, Integer codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Perfil toEnum(Integer cod){
        if (cod == null){
            return null;
        }
        for (Perfil x : Perfil.values()){
            if (cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalArgumentException("Perfil inváçido");
    }
}
