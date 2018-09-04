package exemplo;

public class Vendedor extends Funcionario {
    
    private Double commisao;
    
    private Double totalVendas;

    public Vendedor(Double commisao, Double totalVendas, String nome, Double salario) {
        super(nome, salario);
        this.commisao = commisao;
        this.totalVendas = totalVendas;
    }
    
    @Override
    public Double calculaSalario() {
        
        Double acrescimo = commisao * totalVendas;
        
        return salario + acrescimo;
        
    }
    
    
    public Double getCommisao() {
        return commisao;
    }

    public void setCommisao(Double commisao) {
        this.commisao = commisao;
    }

    public Double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    
    
    
}
