package classesfinal;

public class Professor extends Pessoa{
    private final int salario = 100;
    private String titulo;

    //=========================================================

    /*
    @Override
    public void impLocal(){
        System.out.println("\nEstou na classe FILHA - professor");
        //super.impLocal();//utilizando o recurso super para apontar da classe filha chamando o metodo da classe MAE.
    }
    */
    //=========================================================


    public int getSalario(){
        return salario;
    }
    public String getTitulo(){
        return titulo;
    }
    
    //public void setSalario(int salario){
        //this.salario = salario;
    //}
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
