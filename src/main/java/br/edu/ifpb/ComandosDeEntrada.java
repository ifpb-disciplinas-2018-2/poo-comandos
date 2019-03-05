package br.edu.ifpb;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/02/2019, 09:53:05
 */
public class ComandosDeEntrada {

    public static void main(String[] args) {
        lendoDaEntradaPadrao();
        lendoDoInputDialog();
    }

    private static void lendoDoInputDialog() throws NumberFormatException,HeadlessException {
        String primeiro = JOptionPane.showInputDialog(
            "Digite o primeiro número"
        );
        String segundo = JOptionPane.showInputDialog(
            "Digite o segundo número"
        );
        int primeroNumero = Integer.parseInt(primeiro);
        int segundoNumero = Integer.parseInt(segundo);
        int soma = primeroNumero + segundoNumero;
        System.out.println("soma: " + soma);
    }

    private static void lendoDaEntradaPadrao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int primeiro = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int segundo = scanner.nextInt();
        int soma = primeiro + segundo;
        System.out.println("soma: " + soma);
    }
}
