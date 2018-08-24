package exemplo;

public class Main {

    public static void main(String[] args) {

        /* Instancia um retângulo */
        Retangulo r1 = new Retangulo(20, 10);
        
        r1.imprimeArea();
        r1.imprimePerimetro();
        
        Integer area = r1.calculaArea();
        System.out.println("A área retornada foi " + area);
        
        Integer perimetro = r1.calculaPerimetro();
        System.out.println("O perímetro retornado foi " + perimetro);
        
        
        
    }
    
}
