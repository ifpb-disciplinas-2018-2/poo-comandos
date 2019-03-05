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
        lendoDoInputDialogQuestion();
        lendoDoInputDialogError();
        lendoDaEntradaPadrao();
        lendoDoInputDialog();
    }

    private static void lendoDoInputDialogQuestion() throws HeadlessException {
        String[] cursos = {
            "Licenciatura em Computação",
            "Ciências da Computação",
            "Análise e Desenvolvimento de Sistemas"
        };

        Object curso = JOptionPane.showInputDialog(
            null, // parent
            "Qual é seu curso?", // mensagem
            "Escolha seu curso", // Titulo
            JOptionPane.QUESTION_MESSAGE, //questões
            null, //icon
            cursos, // opções
            cursos[0] // valor inicial
        );
        System.out.println("curso selecionado: " + curso);

    }

    private static void lendoDoInputDialogError() throws HeadlessException {
        String showInputDialog = JOptionPane.showInputDialog(
            null,
            "Qual o seu nome?",
            "Digite seu nome",
            JOptionPane.ERROR_MESSAGE
        );
        //ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, or PLAIN_MESSAGE
        System.out.println("Digitado: " + showInputDialog);

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
