package exemplo;

import gui.MainGui;
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
    
    
    public static void cadastraVendedor(List<Funcionario> lista,
            List<Gerente> gerentes) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o salario:");
        Double salario = scanner.nextDouble();
        
        System.out.println("Informe a comissão:");
        Double comissao = scanner.nextDouble();
        
        System.out.println("Informe o total de vendas:");
        Double totalVendas = scanner.nextDouble();
        
        System.out.println("Selecione um gerente:");
        
        for (int i = 0; i < gerentes.size(); ++i) {
            System.out.printf("[%d] %s\n", i, gerentes.get(i).getNome());
        }
        Integer gerenteSelecionado = scanner.nextInt();
        
        Funcionario vendedor = new Vendedor(comissao, 
                totalVendas, 
                nome, 
                salario);

        lista.add(vendedor);
        
        gerentes.get(gerenteSelecionado)
                .vinculaVendedor((Vendedor) vendedor);
    }
    
    
    /*
     * Cadastra um novo gerente
     */ 
    public static void cadastraGerente(List<Funcionario> lista) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o salario:");
        Double salario = scanner.nextDouble();
        
        System.out.println("Informe a gratificação:");
        Double gratificacao = scanner.nextDouble();
        
        Funcionario gerente = new Gerente(gratificacao,
            nome,
            salario);

        lista.add(gerente);
        
    }
    
    
    /*
     * Imprime a folha de pagamento
     */
    public static void imprimeFolhaPagamento(List<Funcionario> lista) {
        for (Funcionario funcionario : lista) {
            funcionario.imprimeSalario();
        }
    }    
        
    /*
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
        
        List<Gerente> gerentes = new ArrayList<>();
        
        ((Gerente) g1).vinculaVendedor((Vendedor)v1);
        ((Gerente) g1).vinculaVendedor((Vendedor)v2);
        ((Gerente) g1).vinculaVendedor((Vendedor)v3);
        
        lista.add(v1);
        lista.add(v2);
        lista.add(v3);
        lista.add(g1);
        
        gerentes.add((Gerente) g1);
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimeMenu();
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    cadastraVendedor(lista, gerentes);
                    break;
                case 2:
                    cadastraGerente(lista);
                    break;
                case 3:
                    imprimeFolhaPagamento(lista);
                    break;
                case 9:
                    System.out.println("Obrigado!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
            
        }

    }
    */
    
    public static void main(String[] args) {
        
        MainGui mainGui = new MainGui();
        mainGui.setVisible(true);
        
    }
    
    
    
}
