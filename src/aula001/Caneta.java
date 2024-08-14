package aula001;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo = " + this.modelo);
        System.out.println("Carga = " + this.carga);
        System.out.println("Ponta = " + this.ponta);
        System.out.println("Cor = " + this.cor);
        if (this.tampada == true) {
            System.out.println("A caneta está tampada");
        } else {
            System.out.println("A caneta não está tampada");
        }
    }

    void Rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! A caneta esta TAMPADA");
        } else {
            System.out.println("RABISCANDO!");
        }
    }

    void Tampar() {
        this.tampada = true;
    }

    void Destampar() {
        this.tampada = false;
    }
}
