package testapedido;

import java.util.Scanner;

public class TestaPedido {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        
        int opcao = 0;
        
        for(int i = 0; i < 10; i++){
        
           System.out.println("---------------------------");
           System.out.println("Menu de Opções");
           System.out.println("1 - Adicionar item pedido");
           System.out.println("2 - Apresentar o total do pedido.");
           System.out.println("Escolha:");
           opcao = sc.nextInt();  
           System.out.println("---------------------------");
           
           if(opcao == 1){
              
           }
           else if(opcao == 2){
        
           }
           
        }
    }
    
}
