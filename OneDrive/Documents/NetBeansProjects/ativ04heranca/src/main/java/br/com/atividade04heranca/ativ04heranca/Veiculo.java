package br.com.atividade04heranca.ativ04heranca;

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;
    private Passeio passeio;

    // no-arg constructor (keeps existing behavior)
    public Veiculo() {
        this.motor = new Motor();
        this.passeio = new Passeio();
    }

    // full-argument constructor accepting a Motor instance
    public Veiculo(String placa, String marca, String modelo, String cor,
                   float velocMax, int qtdRodas, Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = (motor != null) ? motor : new Motor();
    }

    // alternative constructor that accepts motor parameters
    public Veiculo(String placa, String marca, String modelo, String cor,
                   float velocMax, int qtdRodas, int potencia, int qtdPist) {
        this(placa, marca, modelo, cor, velocMax, qtdRodas, new Motor(potencia, qtdPist));
    }

    // getters and setters used in Teste
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelocMax() {
        return velocMax;
    }
    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }
    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = (motor != null) ? motor : new Motor();
    }

    public abstract float calcVel();

}
