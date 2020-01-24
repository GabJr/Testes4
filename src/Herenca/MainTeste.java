package src.Herenca;

import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Funcionario("Lucas",445588,20,"Masculino",74);
        Pessoa pessoa2 = new Funcionario("Alice",566535,26,"Femenino",24);
        pessoa1.trabalho();
        pessoa2.trabalho();
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        
    }
}

