package aula002;

public class Caneta {
    public String modelo;
    public String cor;
    private String ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
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

    protected void Rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! A caneta esta TAMPADA");
        } else {
            System.out.println("RABISCANDO!");
        }
    }

    public void Tampar() {
        this.tampada = true;
    }

    public void Destampar() {
        this.tampada = false;
    }
}
