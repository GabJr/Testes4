package src.Herenca;

import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);


       // Pessoa pessoa0= new Funcionario(
      //    "Fulnao",3033485,28,"Masculino",25);

        System.out.println("Digite o nome do funcionario:");
        String nome = sc.nextLine();

        System.out.println("Digite o genero");
        String genero = sc.nextLine();

        System.out.println("Digite o telefone");
        int telefone = sc.nextInt();

        System.out.println("Digite a idade:");
        int idade = sc.nextInt();

        System.out.println("Digite o ID do funcionario");
        int id = sc.nextInt();

        Pessoa pessoa1 = new Funcionario(
                nome,
                telefone,
                idade,
                genero,
                id);

       // Pessoa pessoa2 = new Funcionario("Alice",566535,26,"Femenino",24);

       // pessoa2.trabalho();

        System.out.println(pessoa1.toString());
        pessoa1.trabalho();
        
    }

}

