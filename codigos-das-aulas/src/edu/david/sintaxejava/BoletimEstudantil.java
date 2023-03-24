package edu.david.sintaxejava;
import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota um do aluno:");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a nota dois do aluno:");
        float nota2 = sc.nextFloat();
        System.out.println("Digite a nota tres do aluno:");
        float nota3 = sc.nextFloat();
        sc.close();

        float media = calcularMedia(nota1, nota2, nota3);
        if(media>=7)
        System.out.printf("Media = %.1f, aluno aprovado\n", media);
        else
        System.out.printf("Media = %.1f, aluno reprovado\n", media);


    }

    public static float calcularMedia(float nota1, float nota2, float nota3) {
        float media;
        media = (nota1 + nota2 + nota3)/3;
        return media;


    }
}
