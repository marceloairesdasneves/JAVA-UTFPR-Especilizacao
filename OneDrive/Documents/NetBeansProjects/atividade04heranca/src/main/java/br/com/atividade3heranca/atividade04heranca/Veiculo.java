package br.com.atividade3heranca.atividade04heranca;

public abstract class Veiculo { //foi criado uma classe abstract, que nao pode ser instanciada diretamente, servindo como base para outras classes
    //atributos que representam as caracteristicas de um veiculo
    //atributos do tipo private, refere-se a encapsulamento, que so podem ser acessados diretamente dentro da propria classe.
    
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor; //conceito de composicao, e conceito onde uma classe possui uma instancia de outra classe como 
    //parte de sua estrutura private Motor motor, neste conceito de vez herdar comportamentos, a classe sua outra classe
    //como um componente interno, assim a classe veiculo passou a ter um motor em sua composicao
    
    public Veiculo(String placa, String marca, String modelo, String cor){//construtor inicializa os atributos basico
        this.placa = placa;//this referencia ao proprio objeto, usado para diferencia atributos de parametros.
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
    public Veiculo(){//construtor padrao sem parametros, inicializa com valores default.
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.velocMax = 0.0f;
        this.qtdRodas = 0;
        this.motor = new Motor();//estou fazendo uma composicao instanciando um objeto em JAVA. this.motor
    }
    //construtor completo, recebe todos os atributos inclusive o objeto motor.
    public Veiculo(String placa, String marca, String modelo, String cor,float velocMax, int qtdRodas, Motor motor){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = motor;
    }
    //Construtor que cria o motor internamente usando os valores de potencia e pistoes
    public Veiculo(String placa, String marca, String modelo, String cor,
                   float velocMax, int qtdRodas, int potencia, int qtdPist) {
        this(placa, marca, modelo, cor, velocMax, qtdRodas, new Motor(potencia, qtdPist));
    //usando o recurso de chamada de outro construtor com o this
    }
  
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getCor(){
        return cor; 
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public float getVelocMax(){
        return velocMax; 
    }
    public final void setVelocMax(float velocMax){//impede que metodo seja sobrescrito
        this.velocMax = velocMax;
    }
    public int getQtdRodas(){
        return qtdRodas; 
    }
    public void setQtdRodas(int qtdRodas){
        this.qtdRodas = qtdRodas;
    }
    public Motor getMotor(){
        return motor; 
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public abstract float calcVel(float velocMax);//metodo abstract nao tem implementacao aqui.
    //as subclasses Passeio e Carga devem obrigatoriamente implementar esse metodo.

}

