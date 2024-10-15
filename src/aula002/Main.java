package aula002;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic cristal";
        c1.cor = "azul";
        c1.carga = 80; //retorna 80, pq ele esta na classe main, que utiliza a class caneta, entao fazem parte da mesma "hierarquia"
        // c1.tampada = false;
        c1.Tampar(); //por eu utilizar uma funcao que é publica, e que roda dentro da classe, ela sim pode utilizar um elemento privado
        c1.status();

    }
}
