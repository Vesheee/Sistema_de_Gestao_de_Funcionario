package Polimorfismo.ex4;

public abstract class CargoDeConfiaca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfiaca(Sexo sexo, String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(sexo, nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }
}
