package questao01;

public class Colaborador {

    private String nome;
    private String matricula;
    private String escola;
    private String universidade;

    public Colaborador(){
    }

    public Colaborador(String nome, String matricula, String escola, String universidade) {
        this.nome = nome;
        this.matricula = matricula;
        this.escola = escola;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", escola='" + escola + '\'' +
                ", universidade='" + universidade + '\'' +
                '}';
    }
}
