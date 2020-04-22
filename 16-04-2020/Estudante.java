package testeestudante;

public class Estudante {
    
    private final int codigo;
    private final String nome;
    private Data dataNasc;
    private double notaMat;
    private double notaPort;
    private double notaCien;
    
    public Estudante(int c, String n){
        this.codigo = c;
        this.nome = n;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }
    
    void setNotas(double mat, double cien, double port){
        this.notaMat = mat;
        this.notaCien = cien;
        this.notaPort = port;
    }
    
    double calculaMedia(){
        double media;
        media = (this.notaCien + this.notaMat + this.notaPort) / 3;
        return media;
    }
    
    double calculaMedia(int e){
        double media;
        media = (this.notaCien + this.notaMat + this.notaPort) / 3 + e;
        return media;
    }
    
    
}
