package exemplo;

public class Quadrado {
    
    private Integer lado;
    
    public Quadrado(Integer lado) {
        this.lado = lado;
    }
    
    public Integer calculaArea() {
        return lado * lado;
    }
    
    public void imprimeArea() {
        System.out.println(calculaArea());
    }
    
    public Integer calculaPerimetro() {
        return 4 * lado;
    }
    
    public void imprimePerimetro() {
        System.out.println(calculaPerimetro());
    }
    
    public void setLado(Integer lado) {
        
        if (lado < 1) {
            System.err.println("Lado deve ser >= 1.");
        } else {                  
            this.lado = lado;
        }
    }
    
    
    
}
