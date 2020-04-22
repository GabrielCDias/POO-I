package testeestudante;

import java.util.Scanner;

public class TesteEstudante {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        Estudante f1 = new Estudante(1, "José");
        
        System.out.println("Código: " + f1.getCodigo());
        System.out.println("Nome: " + f1.getNome());  
        
        f1.setNotas(4.5,7,10);
        
        System.out.printf("Media: %.1f \n", f1.calculaMedia());
        System.out.printf("Media com ponto extra: %.1f \n", f1.calculaMedia(1));
        
    }
    
}
