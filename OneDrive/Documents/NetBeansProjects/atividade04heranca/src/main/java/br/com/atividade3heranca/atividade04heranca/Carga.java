package br.com.atividade3heranca.atividade04heranca;//declara o pacote da classe, definido seu namespace.

public class Carga extends Veiculo {//Declara a classe publica e final que estende Veiculos (Essa classe nao pode ser herdada)
    private int cargaMax;//campo privado que armazena a carga maxima(peso inteiro)
    private int tara;//campo privado que armazena a tara do veiculos (peso vazio)
    
    //Metodo construtor default
    public Carga(){//construtor default, tipo public sem argumentos
        cargaMax = 0;//mandatorio inicializar a variavel
        tara = 0;
    }
    //metodo construtor passando parametros
    public Carga(int cargaMax, int tara){//metodo Construtor publico que recebe cargaMax e tara
        this.cargaMax = cargaMax;//atribui o parametro cargaMax ao campo da instancia.
        this.tara = tara;//atribui o parametro cargaMax ao campo da instancia.
    }
   //construtor que recebe parametros jpara inicializar a parte veiculo.
    public Carga(String placa, String marca, String modelo, String cor, int f, int i, int i1, int i2) {
        this.cargaMax = 0;//apos delegar para Veiculo, inicializa cargaMax com 0.
        this.tara = 0;//Apos delegar para Veiculo, inicializa a tara
    }
    
    public Carga(String placa, String marca, String modelo, String cor,
                   float velocMax, int qtdRodas, int potencia, int qtdPist, int cargaMax, int tara){
        super(placa, marca, modelo, cor, velocMax, qtdRodas, potencia, qtdPist);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }
    //metodos Getters e Setters
    public int getCargaMax(){//Metodo Getter public que retorn cargaMax
        return cargaMax;//Retorna o valor do campo cargaMax
    }
    public final void setCargaMax(int cargaMax){//Setter public e final para cargaMax (final impede subscrita)
        this.cargaMax = cargaMax;//atribui o parametro ao campo cargaMax da instancia.
    }
    public int getTara(){//Metodo Getter public que retorn
        return tara;//Retorna o valor do campo
    }
    public final void setTara(int tara){//Setter public e final para (final impede subscrita)
        this.tara = tara;//atribui o parametro ao campo cargaMax da instancia.
    }

    @Override
    public float calcVel(float velocMax) {
        return velocMax * 10000;
    }
}
