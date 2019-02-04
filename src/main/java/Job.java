import java.util.Scanner;

public class Job {
    private String cargo;
    private Double salario;

    Scanner input = new Scanner(System.in);

    public Job(String cargo, Double salario) {
        if (cargo == null || cargo == "" || cargo == " ") {
            System.out.println("Por favor informe um cargo válido");
            setCargo(input.nextLine());
        }

        this.cargo = cargo;
        if (salario == 0.0 || salario < 0) {
            System.out.println("Por favor informe um salário válido");
            setSalario(input.nextDouble());
        }
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo == null || cargo == "" || cargo == " ") {
            System.out.println("Por favor informe um cargo válido");
            setCargo(input.nextLine());
        }
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if (salario == 0.0 || salario < 0) {
            System.out.println("Por favor informe um cargo válido");
            setSalario(input.nextDouble());
        }
        this.salario = salario;
    }
}
