package io.github.antoniojobs;

import java.util.Scanner;

public class GamerSort {

    private final Scanner leitor;
    private int numSorteado;
    private int num = 0;
    private int tentativas = 0;
    private int maxTentativa = 5;
    private String sair = "";
    private boolean acertou = false;

    public GamerSort() {
        this(new Scanner(System.in)); // Chama o construtor principal
    }

    public GamerSort(int maxTentativa) {
        this(); // CHAMA O CONSTRUTOR PADRÃO QUE INICIALIZA O LEITOR PRIMEIRO
        this.maxTentativa = maxTentativa;
    }

    public GamerSort(Scanner leitor){
        this.leitor = leitor;
    }

    public int soteador() {
        return (int) Math.round(Math.random() * 100);
    }

    private boolean validador(int num, int numSorteado) {
        if (num == numSorteado)
        {
            return true;
        } else if (num > numSorteado) {
            System.out.println("O número sorteado é menor");
            return false;
        } else {
            System.out.println("O número sorteado é maior");
            return false;
        }
    }



    public void jogar() {

        numSorteado = soteador();

        while (!sair.equals("s") && tentativas < maxTentativa) {
            System.out.println("Vamos começar a brincadeira");
            System.out.println("Adivinhe o número entre 0 e 100");
            acertou = validador(this.num = leitor.nextInt(),numSorteado);

            if(tentativas == maxTentativa - 1) {
                System.out.println("Acabou as chances");
                break;
            }
            else if (acertou) {
                System.out.println("Acertou na tentativa " + (tentativas+1));
                break;

            }else {
                System.out.println("Errou");
                System.out.println("numero sorteado foi: " + numSorteado); //TODO remover depois
                System.out.println("Tentativas restantes: " + (maxTentativa - tentativas));

                System.out.println("===================================");
                System.out.println("Para sair digite s para continuar digite c");

                if (leitor.hasNext()) {
                    this.sair = leitor.next();
                }

                if (sair.equals("s")) {
                    break;
                }
            }
            tentativas++;
        }

    }

}
