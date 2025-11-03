package classesfinal;

public class TstPes {
   public static void main(String[] args) {
        Professor pes1 = new Professor();//estou falando para o pes1 se comportar como Professor classe filha.
        pes1.impLocal();
        System.out.println("\nSalario Prof: " + pes1.getSalario());
        
        //pes1 = new Pessoa();// prof = new Professor();
        
        /*
        Pessoa pes1 = new Pessoa();
        pes1.impLocal();
        
        Pessoa pes2 = new Professor();//polimorfismo por coecao, se comporta com outro objeto
        pes2.impLocal();
        */
   }
}   
    
        /*
        
         prof.setNome("Professor Jose Luiz"); //usado por meio de heranca da classe pessoa
        prof.setCpf(25); //usado por meio de heranca da classe pessoa
        prof.setSalario(1000); //pertence a propria classe
        prof.setTitulo("Mestre");
        
        System.out.println("\n====================================================");
        prof.impLocal();
        System.out.println("\n====================================================");
        
        System.out.println("\nCPF PROFESSOR       " + prof.getCpf() );//usado por meio de heranca da classe pessoa
        System.out.println("NOME PROFESSOR      " + prof.getNome() );//usado por meio de heranca da classe pessoa
        System.out.println("SALARIO PROFESSOR   " + prof.getSalario() );//pertence a propria classe professor
        System.out.println("TITULO PROFESSOR    " + prof.getTitulo() );//pertence a propria classe Professor
        
        System.out.println("\n====================================================");
        Aluno aluno = new Aluno();
        aluno.setNome("Aluno Luiz"); //usado por meio de heranca da classe pessoa
        aluno.setCpf(25); //usado por meio de heranca da classe pessoa
        aluno.setRa(28); //pertence a propria classe
        aluno.setCurso("Espc. JAVA");//pertence a propria classe
        
        System.out.println("\nCPF aluno       " + aluno.getCpf() );//usado por meio de heranca da classe pessoa
        System.out.println("NOME aluno      " + aluno.getNome() );//usado por meio de heranca da classe pessoa
        System.out.println("RA aluno        " + aluno.getRa());//pertence a propria classe professor
        System.out.println("CUROS aluno     " + aluno.getCurso() );//pertence a propria classe Professor
        System.out.println("\n====================================================");
        
    }
}
*/