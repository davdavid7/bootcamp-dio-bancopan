package edu.david.sintaxejava;

public class OperadoresJava {
    public static void main(String[] args) {
        
    /* Operador de atribuição */
    int numero1 = 21;
    int numero2 = -7;
    int novoNumero1, novoNumero2;

    /* Operadores aritméticos */
    int soma = 21 + 7;
    int subtracao = 21 - 7;
    int divisao = 21 / 7;
    int multiplicacao = 21 * 7;
    int resto = 21 % 7; /* retorna o resto da divsão */
    String nome = "Linguagem" + " Java"; /* vai realiazar a concatenação das strings */

    /* Operadores unários */
    novoNumero1 = - numero1;
    novoNumero2 = -1 * numero2;
    novoNumero1 = numero1++; /* realiza o incremento do número */
    novoNumero2 = numero2--; /* realiza o decremento do número */
    boolean valor = true;
    valor = !valor;

    /* Operador ternário */
    String verdadeiroFalso = 22 != 21 ? "verdadeiro" : "falso";

    /* Operadores relacionais */
    String nome1 = "David";
    String nome2 = new String("Sanally");
    boolean trueFalse = nome1.equals(nome2); /* compara dois objetos */
    String maiorQue = 21 > 7 ? "verdadeiro" : "falso";
    String menorQue = 21 < 7 ? "verdadeiro" : "falso";
    String maiorIgual = 21 >= 7 ? "verdadeiro" : "falso";
    String menorIgual = 21 <= 7 ? "verdadeiro" : "falso";

    /* Opereadores lógicos */
    if(3>1 || 2==4){
        System.out.println("Uma das condições é verdadeira");
    }
    if(4==4 && 23<56){
        System.out.println("As duas condições são verdadeiras");
    }


    }
}