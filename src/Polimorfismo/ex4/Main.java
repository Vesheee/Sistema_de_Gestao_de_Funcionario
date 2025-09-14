package Polimorfismo.ex4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Criando Funcionarios
        Motoboy motoboy = new Motoboy(Sexo.MASCULINO,"Carlos","000.000-01","000.001",900,"19/09/2003","25/01/2025","P1N4A");
        Gerente gerente = new Gerente(Sexo.FEMININO,"Larissa","111.111-01","999.999",5500,"20/08/2002","11/02/2020",Bonificacao.GERENTE);
        Diretor diretor = new Diretor(Sexo.MASCULINO,"João","111.111-02","999.888",8000,"02/09/2002","21/04/2021",Bonificacao.DIRETOR);

        //Testando metodo toString();
        System.out.println("------------Funcionarios---------------");
        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());

        //Testando Salario com ajuste
        System.out.println("\n------------Salario Final---------------");
        System.out.println(motoboy.getSalarioFinal());
        System.out.println(gerente.getSalarioFinal());
        System.out.println(diretor.getSalarioFinal());

        //Testanto admissão
        System.out.println("\n------------Admição e Demissão---------------");
        diretor.admitir();
        diretor.demitir();

    }
}
