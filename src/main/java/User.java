import java.util.Scanner;

public class User {
    private String nome = null;
    private String sobrenome = null;
    private String dataNascimento = null;

    //como restringir o tamanho de uma string?
    Scanner input = new Scanner(System.in);

    public User(String nome, String sobrenome, String dataNascimento) {
        if (nome == null) {
            System.out.println("O nome não pode estar vazio, insira um nome");
            setNome(input.nextLine());
        } else {
            this.nome = nome;
        }

        if (sobrenome == null) {
            System.out.println("O sobrenome não pode estar vazio, insira um sobrenome");
            setSobrenome(input.nextLine());
        } else {
            this.sobrenome = sobrenome;
        }

        if (dataNascimento == null) {
            System.out.println("A data de nascimento não pode estar vazia, insira uma data nascimento");
            setDataNascimento(input.nextLine());
        } else {
            this.dataNascimento = dataNascimento;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("O nome não pode estar vazio, insira um nome");
            setNome(input.nextLine());
        }
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome == null) {
            setSobrenome(input.nextLine());
        }
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if (dataNascimento == null) {
            setDataNascimento(input.nextLine());
        }
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return String.format("Nome: " + getNome() + " " + getSobrenome() + "%n" + "Data de nascimento: "
                + getDataNascimento());
    }
}
