package exemplo;

import java.util.Date;


public class Funcionario {
    
    protected String nome;
    
    protected Double salario;
    
    protected Date admissao;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        
        // Inicializa admissao com data atual
        this.admissao = new Date();
        
    }
    
    public Double calculaSalario() {
        return salario;
    }
    
    
    public void imprimeSalario() {
        System.out.printf("Nome: %s | Salário: %.2f\n",
                nome, calculaSalario());
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
    
    
    
}
