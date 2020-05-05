package testaluta;

import java.util.Random;

public class Luta {
    // Atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;

    // Metodos públicos
    public void marcarLuta(Lutador L1, Lutador L2) {
        if (L1.getCategoria().equals(L2.getCategoria())
                && L1 != L2) {
            this.aprovada = true;
            this.desafiado = L1;
            this.desafiante = L2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (aprovada) {
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("### Resultado da luta ###");
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Ganhou desafiado
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // ganhou desafiante
                    System.out.println("Vitoria do" + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println(" A luta nao pode acontecer");
        }
        System.out.println("#########################");

    }
    // Metodos Especiais 

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}