package br.com.ativinterface.aulatrycacth;

public class Pessoa {
    private int cpf;
    private String nome;

    public Pessoa(){
        cpf = 0;
        nome = "";
    }
    //=============================================================
    //TRHOWS -- "com S" e um AVISO, POSSO lancar um objeto do tipo.
    //TRHOW -- "sem S" e um ORDEM, LANCE o objeto do tipo.
    //=============================================================
    public void setCpf(int cpf) throws CpfPeqException, CpfGrdException{
        if(cpf >= 0){
            if(cpf < 100){
                this.cpf = cpf;
            }
            else{
                 throw new CpfGrdException();
            }
        }
        else{
            throw new CpfPeqException();
        }
    }
    public int getCpf(){
        return cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
