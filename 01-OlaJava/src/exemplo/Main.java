package exemplo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String nome;
        Integer idade;
        
        // Classe  objeto    instanciação
        Scanner    scanner = new Scanner(System.in);
        
        System.out.println("Informe o seu nome:");
        nome = scanner.nextLine();
        
        System.out.println("Informe a sua idade:");
        idade = scanner.nextInt();
                
        System.out.printf("Olá %s! Você tem %d anos.\n",
                nome, idade);
        
        
        
    }
    
}
