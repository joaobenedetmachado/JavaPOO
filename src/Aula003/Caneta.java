package Aula003;

public class Caneta {
        public String modelo;
        private float ponta;
        private String cor;
        private boolean tampado;

        public Caneta(String m, float p, String c) { //metodo construtor
            this.modelo = m;
            this.ponta = p;
            this.cor = c;
            this.tampar(); //sempre que eu chamar uma nova classe, ela comecara tampada
//            this.cor = "Vermelho"; // e sempre comecara vermelha
        }

    public Caneta(boolean tampado, String cor, float ponta, String modelo) {
        this.tampado = tampado;
        this.cor = cor;
        this.ponta = ponta;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public boolean isTampado() {
        return tampado;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampado(boolean tampado) {
        this.tampado = tampado;
    }

    public void tampar() {
            this.tampado = true;
        }

        public void destampar() {
            this.tampado = false;
        }

        public String getModelo() {
            return this.modelo;
        }

        public void setModelo(String m) {
            this.modelo = m;
        }

        public float getPonta(){
            return this.ponta;
        }

        public void setPonta(float p) {
            this.ponta = p;
        }

        public void status() {
            System.out.printf("STATUS CANETA: ");
            System.out.println(this.getModelo());
            System.out.println(this.getPonta());
            System.out.println(this.cor);
            System.out.println("esta tampado: " + this.tampado);
        }
}

