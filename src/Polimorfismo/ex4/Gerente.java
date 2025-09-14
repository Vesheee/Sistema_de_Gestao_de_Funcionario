package Polimorfismo.ex4;

public class Gerente extends CargoDeConfiaca  {
    public Gerente(Sexo sexo, String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(sexo, nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase * this.bonificacao.getValor();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
