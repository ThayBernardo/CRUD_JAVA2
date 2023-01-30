package desafioTecnico.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionarios extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionarios(String nome, LocalDate nascimento, BigDecimal salario, String funcao) {
        super(nome, nascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public Funcionarios() {
        super();
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
