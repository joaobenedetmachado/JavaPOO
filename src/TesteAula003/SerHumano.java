package TesteAula003;

public class SerHumano {
    private String Nome;
    private Integer Idade;
    private float Altura;
    private String Sexo;

    public SerHumano(String nome, Integer idade, float altura, String sexo) {
        Nome = nome;
        Idade = idade;
        Altura = altura;
        Sexo = sexo;
    }

    public String getNome() {
        return Nome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public float getAltura() {
        return Altura;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }

    public void setAltura(float altura) {
        Altura = altura;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public void Status() {
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Altura: " + getAltura() + " Sexo: " + getSexo());
    }
}
