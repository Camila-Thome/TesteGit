package br.edu.unisep.testegit.model;

public class joinha {
    private String nome;
    private String email;
    private Boolean sexo;
    private int ano;

    public joinha(String nome, String email, Boolean sexo, int ano) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.ano = ano;
    }
    public Boolean ligar() {
        return this.sexo;
    }
}
