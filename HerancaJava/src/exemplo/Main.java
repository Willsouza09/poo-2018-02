package exemplo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void imprimeMenu() {
        System.out.println("Informe:");
        System.out.println("[1] para cadastrar um vendedor");
        System.out.println("[2] para cadastrar um gerente");
        System.out.println("[3] para imprimir a folha de pagamento");
        System.out.println("[9] para sair");
    }
    
    
    public static void cadastraVendedor(List<Funcionario> lista) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome:");
        String nome = scanner.next();
        
        System.out.println("Informe o salario:");
        Double salario = scanner.nextDouble();
        
        System.out.println("Informe a comissão:");
        Double comissao = scanner.nextDouble();
        
        System.out.println("Informe o total de vendas:");
        Double totalVendas = scanner.nextDouble();
        
        Funcionario vendedor = new Vendedor(comissao, 
                totalVendas, 
                nome, 
                salario);

        lista.add(vendedor);
    }
    

    public static void main(String[] args) {
        
        Funcionario v1 = new Vendedor(0.1, 
                5000.0, 
                "Vendedor 1", 
                3000.0);
        Funcionario v2 = new Vendedor(0.1,
                10000.0,
                "Vendedor 2", 
                4000.0);
        Funcionario v3 = new Vendedor(0.1,
                2000.0,
                "Vendedor 3", 
                2000.0);
        
        Funcionario g1 = new Gerente(0.1, "Gerente 1", 5000.0);
        
        List<Funcionario> lista = new ArrayList<>();
        
        ((Gerente) g1).vinculaVendedor((Vendedor)v1);
        ((Gerente) g1).vinculaVendedor((Vendedor)v2);
        ((Gerente) g1).vinculaVendedor((Vendedor)v3);
        
        lista.add(v1);
        lista.add(v2);
        lista.add(v3);
        lista.add(g1);
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimeMenu();
            
            // TODO: imprimir folha de pagamento
            for (Funcionario f : lista)
                System.out.println("Lista: " + f.getNome());
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    cadastraVendedor(lista);
                    break;
                case 2:
                    System.out.println("cadastro de novo gerente");
                    break;
                case 3:
                    System.out.println("folha de pagamento");
                    break;
                case 9:
                    System.out.println("Obrigado!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
            
        }

    }
    
}
