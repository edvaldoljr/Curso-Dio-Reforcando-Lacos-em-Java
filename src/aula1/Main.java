package aula1;

public class Main {

    public static void main(String[] args) {

        System.out.println("De 0 até 10");
        for (int i = 0; i <= 10; i++ ){
            System.out.print(i + " ");
        }

        System.out.println("\nDe 10 até 0");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        boolean variavel = true;
        while (variavel) {
        System.out.println("\nExecutando o while uma vez ...");
        variavel = false;
        }

        int tentativas = 1;
        int limiteTentivas = 3;
        while (tentativas <= limiteTentivas) {
            System.out.println("Tentativas " + tentativas +  " vez(es).");
            tentativas++;
        }

        tentativas = 1;
        limiteTentivas = 3;
        do {
            System.out.println("Tentativas " + tentativas +  " vez(es).");
            tentativas++;
        } while (tentativas <= limiteTentivas);

        System.out.println("De 3 até 11. OPÇÃO 1");
        for (int i = 1; i <= 11; i = i+2) {
            if (i >= 3 && i <= 11) {
                if (i != 7) {
                    System.out.println("Valor de i " + i);
                }
            }
        }

        System.out.println("De 3 até 11. OPÇÃO 2");
        for (int i = 3; i <= 11; i = i+2) {
            if (i != 7) {
                System.out.println("Valor de i " + i);
            }
        }

        System.out.println("Texto 5 vezes");
        int vez = 1;
        while(vez <= 5) {
            System.out.println("Exibindo o texto a " + vez + "° vez");
            vez++;
        }

        System.out.println("Texto 5 vezes");
        vez = 1;
        boolean continuar = true;
        while(continuar) {
            System.out.println("Exibindo o texto a " + vez + "° vez");
            vez++;
            if (vez > 5) {
                continuar = false;
            }
        }
    }
}

