package aula001;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.carga = 50;
        c1.Tampar();
        c1.ponta = 0.5f;
        c1.status();
        c1.Rabiscar();

        System.out.println("=================");

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.Destampar();
        c2.carga = 100;
        c2.status();
        c2.Rabiscar();

        Celular celular1 = new Celular();
        celular1.marca = "Iphone";
        celular1.modelo = "11";
        celular1.dimensoes = "15x8";
        celular1.bateria = 10;
        celular1.desligar();
        celular1.status();
    }
}
