package exemplo;

public class Gerente extends Funcionario {
    
    private Double gratificacao;

    public Gerente(Double gratificacao, String nome, Double salario) {
        super(nome, salario);
        this.gratificacao = gratificacao;
    }
    
    @Override
    public Double calculaSalario() {
        Double acrescimo = gratificacao * salario;
        
        return salario + acrescimo;
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }
      
    
}
