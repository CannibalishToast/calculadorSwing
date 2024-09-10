package Calculadora;

import java.util.Scanner;
import calculadora.operaciones.Operaciones;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        Operaciones calculadora = new Operaciones();
        Scanner entrada = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "¡Bienvenido a mi calculadora!");

        String opcionMenu = "";
        double resultadoAcumulado = 0;

        while (!opcionMenu.equals("6")) {

            opcionMenu = JOptionPane.showInputDialog("Seleccione una opción (1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir, 5. Limpiar, 6. Salir)");
            
            if (opcionMenu.equals("1")) {
                JOptionPane.showMessageDialog(null, "Ingrese el primer número: ");
                double primerNumero = Integer.parseInt(JOptionPane.showInputDialog(""));
                JOptionPane.showMessageDialog(null, "Ingrese el segundo número: ");
                double segundoNumero = Integer.parseInt(JOptionPane.showInputDialog(""));
                double resultado = resultadoAcumulado + calculadora.sumar(primerNumero, segundoNumero);
                resultadoAcumulado = resultado;
                JOptionPane.showMessageDialog(null, primerNumero + " + " + segundoNumero + " = " + resultado);

            } else if (opcionMenu.equals("2")) {
                JOptionPane.showMessageDialog(null, "Ingrese el primer número: ");
                double primerNumero = Integer.parseInt(JOptionPane.showInputDialog(""));
                JOptionPane.showMessageDialog(null, "Ingrese el segundo número: ");
                double segundoNumero = Integer.parseInt(JOptionPane.showInputDialog(""));
                double resultado = resultadoAcumulado + calculadora.restar(primerNumero, segundoNumero);
                resultadoAcumulado = resultado;
                JOptionPane.showMessageDialog(null, primerNumero + " - " + segundoNumero + " = " + resultado);

            } else if (opcionMenu.equals("3")) {
                JOptionPane.showMessageDialog(null, "Ingrese el primer número: ");
                double primerNumero = Integer.parseInt(JOptionPane.showInputDialog(""));
                JOptionPane.showMessageDialog(null, "Ingrese el segundo número: ");
                double segundoNumero = Integer.parseInt(JOptionPane.showInputDialog(""));
                double resultado = resultadoAcumulado + calculadora.multiplicar(primerNumero, segundoNumero);
                resultadoAcumulado = resultado;
                JOptionPane.showMessageDialog(null, primerNumero + " * " + segundoNumero + " = " + resultado);

            } else if (opcionMenu.equals("4")) {
                JOptionPane.showMessageDialog(null, "Ingrese el primer número: ");
                double primerNumero = Integer.parseInt(JOptionPane.showInputDialog(""));
                JOptionPane.showMessageDialog(null, "Ingrese el segundo número: ");
                double segundoNumero = Integer.parseInt(JOptionPane.showInputDialog(""));
                double resultado = resultadoAcumulado + calculadora.dividir(primerNumero, segundoNumero);
                resultadoAcumulado = resultado;
                JOptionPane.showMessageDialog(null, primerNumero + " / " + segundoNumero + " = " + resultado);

            } else if (opcionMenu.equals("5")) {
                resultadoAcumulado = 0;

            } else if (opcionMenu.equals("6")) {
                return;
            }
        }
    }
}