package Aula003;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.7f, "Azul");
        c1.status();

//        c1.setModelo("BIC");
//        c1.modelo = "BIC"; isso daria pra acontecer pois modelo é public, e pelo metodo acessor tambem
//        c1.setPonta(0.6f);
//        c1.ponta = 0.5f; isso ja retornaria o erro "java: ponta has private access in Aula003.Caneta" pois ponta é private, sendo possivel apenas adcionar com o metodo acessor
//        System.out.println("Tenho uma Caneta de modelo " + c1.getModelo() + " com a ponta de " + c1.getPonta());
    }
}
