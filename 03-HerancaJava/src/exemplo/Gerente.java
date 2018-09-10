package exemplo;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    
    private Double gratificacao;
    
    private List<Vendedor> vendedores;

    public Gerente(Double gratificacao, String nome, Double salario) {
        super(nome, salario);
        this.gratificacao = gratificacao;
        this.vendedores = new ArrayList<>();
    }
    
    /*
     * Vincula um vendedor a este gerente
     */
    public void vinculaVendedor(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }
    
    @Override
    public Double calculaSalario() {
        
        // Calcula o total de vendas dos vendedores
        // sob supervisão do gerente
        Double totalVendas = 0.0;
        
        for (Vendedor v : vendedores) {
            totalVendas += v.getTotalVendas();
        }
        
        // Calcular o acréscimo a partir do total de vendas
        Double acrescimo = gratificacao * totalVendas;
        
        return salario + acrescimo;
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }
      
    
}
