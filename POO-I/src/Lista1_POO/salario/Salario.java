package Lista1_POO.salario;

public class Salario {
    private double salHora;
    private double horasTrabalhadas;

    public double getSalHora() {
        return salHora;
    }

    public void setSalHora(double salHora) {
        this.salHora = salHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double salarioBruto() {
        return salHora * horasTrabalhadas;
    }

    public double ir() {
        return salarioBruto() * 0.11;
    }

    public double inss() {
        return salarioBruto() * 0.08;
    }

    public double sindicato() {
        return salarioBruto() * 0.05;
    }

    public double totalDescontos() {
        return ir() + inss() + sindicato();
    }

    public double salarioLiquido() {
        return salarioBruto() - totalDescontos();
    }
}
