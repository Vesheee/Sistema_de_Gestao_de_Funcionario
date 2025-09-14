package Polimorfismo.ex4;

public abstract class Funcionario implements SalarioFinal {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Sexo sexo;
    protected double salarioBase;
    protected String dataNascimento;
    protected String dataAdmissao;

    public Funcionario(Sexo sexo, String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao) {
        this.sexo = sexo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }
}
