package aula004;

public class Banco {
    private int numConta;
    private String tipoDaConta;
    private String nomeDoDono;
    private float saldo;
    private String status;

    public Banco(float saldo, String status) {
        this.saldo = saldo;
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        if (tipoDaConta.equals("CP") || tipoDaConta.equals("CC")) {
            if (tipoDaConta.equals("CP")) {
                setSaldo(150);
            } else {
                setSaldo(50);
            }
        } else {
            System.out.println("Nao aceitamos esse tipo de conta, use CP para conta poupança ou CC para conta corrente! ");
        }
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        setTipoDaConta(tipo);
        setStatus("Aberta");
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("A conta ainda possui" + getSaldo() + "retire o valor para regularizarmos");
        } else if (this.saldo < 0) {
            System.out.println("A conta esta negativada, regularize-a antes de fecha-la");
        } else {
            setStatus("Fechada");
            System.out.println("Conta esta fechada!");
        }
    }

    public void Depositar(float valor) {
        if (status.equals("Fechada")) {
            System.out.println("A conta esta fechada, abra-a para conseguir adcionar o valor.");
        } else {
            float valorAtual = getSaldo();
            setSaldo(valorAtual + valor);
            System.out.println("Valor adcionado");
        }
    }

    public void Sacar(float valor) {
        if (status.equals("Aberta")) {
            if (saldo >= valor) {
                setSaldo(saldo - valor);
                System.out.println("Saque de " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Você não possui saldo suficiente.");
            }
        } else {
            System.out.println("Não é possível sacar de uma conta fechada.");
        }
    }

    public void ConsultarConta() {
        System.out.println("Voce pussui " + getSaldo() + " Reais");
    }
}
