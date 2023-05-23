import java.util.Random;
import java.util.Scanner;

public class Formativa {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

   public void exercicio1() {
        System.out.print("Digite o numero de linhas: ");
        int nLinhas = sc.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int nColunas = sc.nextInt();

        int matriz[][] = new int[nLinhas][nColunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }

        System.out.println("A matriz com os valores randomizados fica:");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" | ");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }
        System.out.println("Substituindo os valores: ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" | ");
        }
    }

        
    
    public void exercicio2() {
        int nSorteado = rd.nextInt(1000);
        int cont = 1;
        System.out.println("Digite um Número");
        int nDigitado = sc.nextInt();
        while (nSorteado != nDigitado) {
            System.out.println("Digite outro Número");
            nDigitado = sc.nextInt();
            cont++;
            if (nDigitado == nSorteado) {
            } else if (nDigitado > nSorteado) {
                System.out.println("O Número é maior que o Sorteado");
            } else {
                System.out.println("O Número é Menor que o Sorteado");
            }
        }
        System.out.println("Parabens você acertou");
        System.out.println("Em " + cont + " tentativas");
    }
    public void exercicio3() {
        int vetor[] = new int[rd.nextInt(900) + 100];
        int contImparNaPar = 0;
        int contParNaImpar = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100) + 1;

        }
    
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) { 
                System.out.println(vetor[i]);
                if (i % 2 == 1) { 
                    contImparNaPar++;
                }
            }
        }
     
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) { 
                System.out.println(vetor[i]);
            }
            if (i % 2 == 0) { 
                contParNaImpar++;
            }
        }
    
        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 0) {
                contParNaImpar++;
            }
        }
        
        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 1) {
                contImparNaPar++;
            }
        }
    }
}
