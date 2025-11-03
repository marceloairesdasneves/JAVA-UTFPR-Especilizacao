package br.com.atividade3heranca.atividade04heranca;


public class Passeio extends Veiculo {//A classe Passeio esta herdando todos os atributos e metodos da classe Veiculo
    private int qtdPassageiros;//Atributo exclusivo da classe Passeio, tipo private encapsulamento e so pode ser
    //acessado diretamente dentro da propria classe.
    
    //metodos Construtores default
    public Passeio(){//construtor padrao
        qtdPassageiros = 0;
    }
    //metodo Construtores passando parametros, construindo e definindo a quantidade de passageiros ao criar objeto
    public Passeio(int qtdPassageiros){
        this.qtdPassageiros = qtdPassageiros;
    }
    //Construtor completo, usa a super para chama o construtor da superclasse Veiculo, para inicializar os atributos
    //herdados., o this.qtdPassageiros, inicializa o atributo da classe Passeio.
    public Passeio(int qtdPassageiros, String placa, String marca, String modelo, String cor,
                   float velocMax, int qtdRodas, int potencia, int qtdPist){
        super(placa, marca, modelo, cor, velocMax, qtdRodas, potencia, qtdPist);
        this.qtdPassageiros = qtdPassageiros;
    }
    //metodos Getters e Setters
    public int getQtdPassageiros(){
        return qtdPassageiros;
    }
    public final void setQtdPassageiros(int qtdPassageiros){
        this.qtdPassageiros = qtdPassageiros;
    }
    
    @Override//Sobrescrita de metodo abstract, calcVel da classe Veiculo, implementa logica especifica de Passeio
    public float calcVel(float velocMax){
        return velocMax *1000;
    }
}
