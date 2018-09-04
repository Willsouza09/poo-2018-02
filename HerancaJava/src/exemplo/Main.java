package exemplo;

public class Main {

    public static void main(String[] args) {
        
        Funcionario joao = new Vendedor(0.05, 
                5000.0, 
                "João", 
                3000.0);
        Funcionario maria = new Vendedor(0.05,
                8000.0, 
                "Maria", 
                4000.0);
        
        Funcionario jose = new Gerente(0.1, "José", 5000.0);
        
        Funcionario[] vetor = {joao, maria, jose};
        
        for (int i = 0; i < vetor.length; ++i) {
            vetor[i].imprimeSalario();
        }
        

    }
    
}
