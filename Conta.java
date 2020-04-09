package testeconta;

public class Conta {
    
    String titular; 
    double saldo;
    int numero;
    Data dataDeAbertura;

    
    boolean saca(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            return true;
        }
        
        return false;
    }
    
    void deposita(double valor) {
        this.saldo += valor; // é a mesma coisa que this.saldo = this.salvo + valor;
    }
    
    double calculaRendimento(Conta atual){
       atual.saldo = atual.saldo * 0.1;
       return atual.saldo;
    }
    
    String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.titular;
             dados += "\nNúmero: " + this.numero;
             return dados;
    }
    
    
}
