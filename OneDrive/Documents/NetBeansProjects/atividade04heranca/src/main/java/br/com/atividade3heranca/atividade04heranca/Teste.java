package br.com.atividade3heranca.atividade04heranca;

public class Teste {
    public static void main(String[] args) {
        
        //==============================================Veiculo de Passeio==============================
        //Instanciando veiculo de Passeio, criando um objeto p1 da classe Passeio.
        //Usando o construtor completo da classe Passeio, que chama o construtor da superclasse Veiculo.
        
        Passeio p1 = new Passeio(5, "AAA-1234", "FIAT", "Uno", "Vermelho", 240.0f, 4, 75, 5);
        Passeio p2 = new Passeio(5, "BBB-1234", "GOL", "Bola", "Azul", 210.0f, 4, 75, 5);
        Passeio p3 = new Passeio(5, "CCC-1234", "CORSA", "Wind", "Vede", 220.0f, 4, 75, 5);
        Passeio p4 = new Passeio(5, "DDD-1234", "CRETA", "SUV", "Amarelo", 280.0f, 4, 75, 5);
        Passeio p5 = new Passeio(5, "EEE-1234", "FIORINO", "Cargo", "Prata", 199.0f, 4, 75, 5);
        
        //==============================================Veiculo de Carga==============================
        
        Carga c1 = new Carga("FFF-1234", "SCANIA", "Cancamba", "Vermelho", (int)240.0f, 20, 1075, 5, 1155,620);
        Carga c2 = new Carga("GGG-1234", "MERCEDES", "Cegonha", "Roxo", (int)240.0f, 20, 2075, 5, 1015,520);
        Carga c3 = new Carga("HHH-1234", "FORD", "Guindaste", "Branco", (int)240.0f, 18, 3075, 5, 2015,750);
        Carga c4 = new Carga("JJJ-1234", "RENO", "Truck", "Azul", (int)240.0f, 22, 4075, 5, 3015,800);
        Carga c5 = new Carga("LLL-1234", "BRABO", "Areiro", "Preto", (int)240.0f, 22, 5075, 5, 4025,605);
                
        System.out.println("\n========================Carro de Passeio P1=====================");
        System.out.println("Placa.......: " + p1.getPlaca());
        System.out.println("Marca.......: "+ p1.getMarca());
        System.out.println("Modelo......: "+ p1.getModelo());
        System.out.println("Cor.........: "+ p1.getCor());
        System.out.println("Velocidade..: "+ p1.getVelocMax()+" velocidade Max por hora");
        System.out.println("QtdRodas....: "+ p1.getQtdRodas());
        System.out.println("Motor.......: "+ p1.getMotor().getQtdPist()+" versao do Motor");
        System.out.println("Potencia....: "+ p1.getMotor().getPotencia() + " cilindros. ");
        System.out.println("Passageiros.: "+ p1.getQtdPassageiros() + " total passageiros. ");
        
        System.out.println("\n========================Carro de Passeio P2=====================");
        System.out.println("Placa.......: " + p2.getPlaca());
        System.out.println("Marca.......: "+ p2.getMarca());
        System.out.println("Modelo......: "+ p2.getModelo());
        System.out.println("Cor.........: "+ p2.getCor());
        System.out.println("Velocidade..: "+ p2.getVelocMax()+" velocidade Max por hora");
        System.out.println("QtdRodas....: "+ p2.getQtdRodas());
        System.out.println("Motor.......: "+ p2.getMotor().getQtdPist()+" versao do Motor");
        System.out.println("Potencia....: "+ p2.getMotor().getPotencia() + " cilindros. ");
        System.out.println("Passageiros.: "+ p2.getQtdPassageiros() + " total passageiros. ");
        
        System.out.println("\n========================Carro de Passeio P3=====================");
        System.out.println("Placa.......: " + p3.getPlaca());
        System.out.println("Marca.......: "+ p3.getMarca());
        System.out.println("Modelo......: "+ p3.getModelo());
        System.out.println("Cor.........: "+ p3.getCor());
        System.out.println("Velocidade..: "+ p3.getVelocMax()+" velocidade Max por hora");
        System.out.println("QtdRodas....: "+ p3.getQtdRodas());
        System.out.println("Motor.......: "+ p3.getMotor().getQtdPist()+" versao do Motor");
        System.out.println("Potencia....: "+ p3.getMotor().getPotencia() + " cilindros. ");
        System.out.println("Passageiros.: "+ p3.getQtdPassageiros() + " total passageiros. ");
        
        System.out.println("\n========================Carro de Passeio P4=====================");
        System.out.println("Placa.......: " + p4.getPlaca());
        System.out.println("Marca.......: "+ p4.getMarca());
        System.out.println("Modelo......: "+ p4.getModelo());
        System.out.println("Cor.........: "+ p4.getCor());
        System.out.println("Velocidade..: "+ p4.getVelocMax()+" velocidade Max por hora");
        System.out.println("QtdRodas....: "+ p4.getQtdRodas());
        System.out.println("Motor.......: "+ p4.getMotor().getQtdPist()+" versao do Motor");
        System.out.println("Potencia....: "+ p4.getMotor().getPotencia() + " cilindros. ");
        System.out.println("Passageiros.: "+ p4.getQtdPassageiros() + " total passageiros. ");
        
        System.out.println("\n========================Carro de Passeio P5=====================");
        System.out.println("Placa.......: " + p5.getPlaca());
        System.out.println("Marca.......: "+ p5.getMarca());
        System.out.println("Modelo......: "+ p5.getModelo());
        System.out.println("Cor.........: "+ p5.getCor());
        System.out.println("Velocidade..: "+ p5.getVelocMax()+" velocidade Max por hora");
        System.out.println("QtdRodas....: "+ p5.getQtdRodas());
        System.out.println("Motor.......: "+ p5.getMotor().getQtdPist()+" versao do Motor");
        System.out.println("Potencia....: "+ p5.getMotor().getPotencia() + " cilindros. ");
        System.out.println("Passageiros.: "+ p5.getQtdPassageiros() + " total passageiros. ");
 
        System.out.println("\n\n========================Veiculo tipo Carga C1=====================");
        System.out.println("Placa.......: " + c1.getPlaca());
        System.out.println("Marca.......: "+ c1.getMarca());
        System.out.println("Modelo......: "+ c1.getModelo());
        System.out.println("Cor.........: "+ c1.getCor());
        System.out.println("Velocidade..: "+ c1.getVelocMax()+" velocidade Max por hora");
        System.out.println("QtdRodas....: "+ c1.getQtdRodas());
        System.out.println("Motor.......: "+ c1.getMotor().getQtdPist()+" versao do Motor");
        System.out.println("Potencia....: "+ c1.getMotor().getPotencia() + " cilindros. ");
        System.out.println("Carga.......: "+ c1.getCargaMax()+ " capacidade de Carga.");
        System.out.println("Tara........: "+ c1.getTara());
        
        
        System.out.println("\n========================Veiculo tipo Carga C2=====================");
        System.out.println("Placa.......: " + c2.getPlaca());
        System.out.println("Marca.......: "+ c2.getMarca());
        System.out.println("Modelo......: "+ c2.getModelo());
        System.out.println("Cor.........: "+ c2.getCor());
        System.out.println("Velocidade..: "+ c2.getVelocMax()+" velocidade Max por hora");
        System.out.println("QtdRodas....: "+ c2.getQtdRodas());
        System.out.println("Motor.......: "+ c2.getMotor().getQtdPist()+" versao do Motor");
        System.out.println("Potencia....: "+ c2.getMotor().getPotencia() + " cilindros. ");
        System.out.println("Carga.......: "+ c2.getCargaMax()+" capacidade de Carga.");
        System.out.println("Tara........: "+ c2.getTara());
        
        System.out.println("\n========================Veiculo tipo Carga C3=====================");
        System.out.println("Placa.......: " + c3.getPlaca());
        System.out.println("Marca.......: "+ c3.getMarca());
        System.out.println("Modelo......: "+ c3.getModelo());
        System.out.println("Cor.........: "+ c3.getCor());
        System.out.println("Velocidade..: "+ c3.getVelocMax()+" velocidade Max por hora");
        System.out.println("QtdRodas....: "+ c3.getQtdRodas());
        System.out.println("Motor.......: "+ c3.getMotor().getQtdPist()+" versao do Motor");
        System.out.println("Potencia....: "+ c3.getMotor().getPotencia() + " cilindros. ");
        System.out.println("Carga.......: "+ c3.getCargaMax()+" capacidade de Carga.");
        System.out.println("Tara........: "+ c3.getTara());
        
        System.out.println("\n========================Veiculo tipo Carga C4=====================");
        System.out.println("Placa.......: " + c4.getPlaca());
        System.out.println("Marca.......: "+ c4.getMarca());
        System.out.println("Modelo......: "+ c4.getModelo());
        System.out.println("Cor.........: "+ c4.getCor());
        System.out.println("Velocidade..: "+ c4.getVelocMax()+" velocidade Max por hora");
        System.out.println("QtdRodas....: "+ c4.getQtdRodas());
        System.out.println("Motor.......: "+ c4.getMotor().getQtdPist()+" versao do Motor");
        System.out.println("Potencia....: "+ c4.getMotor().getPotencia() + " cilindros. ");
        System.out.println("Carga.......: "+ c4.getCargaMax()+" capacidade de Carga.");
        System.out.println("Tara........: "+ c4.getTara());
        
        System.out.println("\n========================Veiculo tipo Carga C5=====================");
        System.out.println("Placa.......: " + c5.getPlaca());
        System.out.println("Marca.......: "+ c5.getMarca());
        System.out.println("Modelo......: "+ c5.getModelo());
        System.out.println("Cor.........: "+ c5.getCor());
        System.out.println("Velocidade..: "+ c5.getVelocMax()+" velocidade Max por hora");
        System.out.println("QtdRodas....: "+ c5.getQtdRodas());
        System.out.println("Motor.......: "+ c5.getMotor().getQtdPist()+" versao do Motor");
        System.out.println("Potencia....: "+ c5.getMotor().getPotencia() + " cilindros. ");
        System.out.println("Carga.......: "+ c5.getCargaMax()+" capacidade de Carga.");
        System.out.println("Tara........: "+ c5.getTara());
    }
}
