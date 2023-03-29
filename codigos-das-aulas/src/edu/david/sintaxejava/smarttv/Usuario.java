package edu.david.sintaxejava.smarttv;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual ação você quer realizar?");
        String acao = sc.nextLine();

        boolean validacao = acao.equals("parar");
        
        while(validacao == false){
            if(acao.equals("ligar")){
                smartTv.ligar();
            } else if(acao.equals("desligar")){
                smartTv.desligar();
            } else if(acao.equals("aumentar volume")){
                smartTv.aumentarVolume();
            }else if(acao.equals("abaixar volume")){
                smartTv.diminuirVolume();
            }else if(acao.equals("aumentar canal")){
                smartTv.aumentarCanal();
            }else if(acao.equals("diminuir canal")){
                smartTv.diminuirCanal();
            }else if(acao.equals("selecionar canal")){
                System.out.println("Digite o canal para qual quer mudar: ");
                int novoCanal = sc.nextInt();
                smartTv.mudarCanal(novoCanal);
                sc.close();
            }
            else{
                System.out.println("Opção não válida. Tente novamente.");
            }
            sc = new Scanner(System.in);
            System.out.println("Qual ação você quer realizar?");
            acao = sc.nextLine();
            if(acao.equals("parar")){
                break;
            }
    }
    }
}
