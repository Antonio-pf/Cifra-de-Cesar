package App;

import Cifrador.Cifrador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Cifrador cifrador = new Cifrador();

        String fraseOriginal = "";

        System.out.println("--------------CIFRADOR DE CESÁR-------------");

        System.out.println("Digite seu segredo para guardarmos: ");
        fraseOriginal = scan.nextLine();

        System.out.println("Seu segredinho: " + fraseOriginal);
        String fraseEncriptada = cifrador.guardar(fraseOriginal);

        System.out.println("Segredo muito bem guardado: " + fraseEncriptada);

        String revela = cifrador.revelar(fraseEncriptada);

        System.out.println("Segredo revelado: " + revela);

    }
}
