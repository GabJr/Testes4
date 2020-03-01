package src.br.com.tryCatch;

public class MinhaClasse {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[6]);
        }catch (Exception e){
            System.out.println("Aconteu algo de errado");
        }
    }
}
