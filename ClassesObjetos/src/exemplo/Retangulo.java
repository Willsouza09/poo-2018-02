package exemplo;

public class Retangulo {
    
    /* Atributos */
    private Integer base;
    private Integer altura;
    
    /* Métodos */
    
    // Construtor
    public Retangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void imprimeArea() {
        System.out.println(calculaArea());
    }
    
    public Integer calculaArea() {
        return base * altura;
    }
    
    public void imprimePerimetro() {
        System.out.println(calculaPerimetro());
    }
    
    public Integer calculaPerimetro() {
        return 2 * base + 2 * altura;
    }
    
    
    
    
    
    
}
