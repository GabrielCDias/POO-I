package testeestudante;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    void Data() {

    }

    void setData(int ano, int mes, int dia) {

        if (ano > 1900 && ano <= 2020) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido");
        }

        if (mes >= 01 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mes inválido");
        }

        switch (mes) {

            case 1:
                if (mes >= 1 && mes <= 31) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 2:
                if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
                    if (mes >= 1 && mes <= 29) {
                    }
                } else if (mes >= 1 && mes <= 28) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 3:
                if (mes >= 1 && mes <= 31) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 4:
                if (mes >= 1 && mes <= 30) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 5:
                if (mes >= 1 && mes <= 30) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 6:
                if (mes >= 1 && mes <= 30) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 7:
                if (mes >= 1 && mes <= 31) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 8:
                if (mes >= 1 && mes <= 31) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 9:
                if (mes >= 1 && mes <= 30) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 10:
                if (mes >= 1 && mes <= 31) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 11:
                if (mes >= 1 && mes <= 30) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }

            case 12:
                if (mes >= 1 && mes <= 31) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido");
                }
        }
    }
    
    void getData (){
   
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

}
