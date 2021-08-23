package questao3;

public class Morador {

    private String telefone;
    private Integer numeroResidencia;

    public Morador(){}

    public Morador(String telefone, Integer numeroResidencia) {
        this.telefone = telefone;
        this.numeroResidencia = numeroResidencia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(Integer numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    @Override
    public String toString() {
        return "Morador{" +
                "telefone='" + telefone + '\'' +
                ", numeroResidencia=" + numeroResidencia +
                '}';
    }
}
