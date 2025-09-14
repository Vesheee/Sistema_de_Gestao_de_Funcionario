package Polimorfismo.ex4;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(Sexo sexo, String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, String placaDaMoto) {
        super(sexo, nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }
}
