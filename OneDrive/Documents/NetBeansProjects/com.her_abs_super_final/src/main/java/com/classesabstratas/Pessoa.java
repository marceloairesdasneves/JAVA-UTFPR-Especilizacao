package com.classesabstratas;

public abstract class Pessoa {//classe abstract como uma classe Mae, utilizando seus objetos 
    private int cpf;
    private String nome;

    //=========================================================
    public abstract void impLocal(); //metodo abstract nao pode ter corpo. Isso e regra
    //=========================================================

    public int getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
