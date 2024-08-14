package aula001;

public class Celular {
    String marca;
    String modelo;
    String dimensoes;
    int bateria;
    boolean usando;

    void status() {
        System.out.println("Marca = " + this.marca);
        System.out.println("Modelo = " + this.modelo);
        System.out.println("Dimensões = " + this.dimensoes);
        System.out.println("Bateria em " + this.bateria + "%");
        System.out.println("Usando = " + this.usando);
    }


    void ligar() {
        if (this.bateria >= 1) {
            this.usando = true;
            System.out.println("Celular Ligado");
        } else {
            this.usando = false;
            System.out.println("Celular Desligado");
        }
    }

    void desligar() {
        this.usando = false;
        System.out.println("Celular Desligado");
    }
}
