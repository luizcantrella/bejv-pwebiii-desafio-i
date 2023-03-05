import java.math.BigDecimal;

public class Animal {

    private String alimentacao;
    private String locomocao;
    private BigDecimal tamanho;

    public Animal(String _alimentacao, String _locomocao, BigDecimal _tamanho) {
        alimentacao = _alimentacao;
        locomocao = _locomocao;
        tamanho = _tamanho;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public BigDecimal getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "alimentacao='" + alimentacao + '\'' +
                ", locomocao='" + locomocao + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
