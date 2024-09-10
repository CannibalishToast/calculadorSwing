package calculadora.operaciones;

public class Operaciones {

    public Operaciones() {
    }

    public double sumar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public double multiplicar(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public double dividir(double primerNumero, double segundoNumero) {
        if (segundoNumero == 0)
            return 0;

        return primerNumero / segundoNumero;
    }

    public double restar(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }
}