package aula004;

public class Main {
    public static void main(String[] args) {
        Banco b1 = new Banco(0, "fechado");
        b1.abrirConta("CC");
        b1.ConsultarConta();
        b1.Depositar(1420);
        b1.ConsultarConta();
        b1.Sacar(2000);
        b1.Depositar(1420);
        b1.ConsultarConta();
    }
}
