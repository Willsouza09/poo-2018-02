package exemplo;

import java.util.Scanner;

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

    public Retangulo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a base:");
        this.base = scanner.nextInt();
        
        System.out.println("Informe a altura:");
        this.altura = scanner.nextInt();
        
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
    
    // Compara 2 retângulos
    public Integer compara(Retangulo outro) {
        Integer minhaArea = this.calculaArea();
        Integer areaOutro = outro.calculaArea();
        
        return minhaArea.compareTo(areaOutro);
        
    }
    
    // Getters e setters

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    
}
