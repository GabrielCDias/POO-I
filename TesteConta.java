package testeconta;

public class TesteConta {

    public static void main(String[] args) {
       
        Conta c1 = new Conta();
        c1.titular = "Gabriel";
        c1.saldo = 1000;
        c1.numero = 123;
                
        Conta c2 = new Conta();
        c2.titular = "Danilo";
        c2.saldo = 9000;
        c2.numero = 321;
        
        
        if (c1 == c2) {
         System.out.println("As contas são iguais");
        } 
        else {
         System.out.println("As contas são diferentes");        
           }
        
        
        c1.deposita(100.0);           
          System.out.println("A conta do titular:" + c1.titular);
          System.out.println("saldo atual:" + c1.saldo);
          System.out.println("rendimento mensal:" + c1.calculaRendimento(c1) + "\n");
      
        c2.saca(700.0);
          System.out.println("A conta do titular:" + c2.titular);
          System.out.println("saldo atual:" + c2.saldo);
          System.out.println("rendimento mensal:" + c2.calculaRendimento(c2) + "\n");
    }
    
}
