package Polimorfismo.ex4;

public class Diretor extends CargoDeConfiaca implements Contratacao{
    private double premio = 1.1;

    public Diretor(Sexo sexo, String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(sexo, nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    public double getPremio() {
        return premio;
    }

    @Override
    public double getSalarioFinal() {
        return (salarioBase * this.bonificacao.getValor()) * this.getPremio();
    }

    @Override
    public void admitir() {
        System.out.println("O diretor " + this.nome + " admitiu um funcionario sucesso");
    }

    @Override
    public void demitir() {
        System.out.println("O diretor " + this.nome + " demitiu um funcionario sucesso");
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "premio=" + premio +
                ", bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }
}
