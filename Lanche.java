import java.util.Scanner;

public class Lanche {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n");
        System.out.println(" CÓDIGO  |  ESPECIFICAÇÃO  |   PREÇO  ");
        System.out.println(" 1         Misto             R$2.50");
        System.out.println(" 2         Cachorro Quente   R$3.00");
        System.out.println(" 3         X-Bacon           R$4.00");
        System.out.println(" 4         X-Tudo            R$4.50");
        System.out.println(" 5         X-Triplo          R$5.00");
        System.out.println(" 6         X-Montanha        R$6.00");
        System.out.println(" CÓDIGO  |  ESPECIFICAÇÃO  |   PREÇO  ");
        System.out.println(" 7         Água              R$1.50");
        System.out.println(" 8         Suco              R$2.50");
        System.out.println(" 9         Refrigerante      R$3.50");
        System.out.println("______________________________________");
        System.out.println("\n");

        double total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0, total6 = 0;

        char pergunta1;
        do {
            System.out.print("Digite o código do lanche: ");
            int codigoL = sc.nextInt();

            switch (codigoL) {
                case 1 -> {
                    System.out.print("Digite a quantidade: ");
                    int quantidadeL1 = sc.nextInt();
                    total1 = quantidadeL1 * 2.5;
                    System.out.printf("Total: R$%.2f\n", total1);
                }
                case 2 -> {
                    System.out.print("Digite a quantidade: ");
                    int quantidadeL2 = sc.nextInt();
                    total2 = quantidadeL2 * 3.0;
                    System.out.printf("Total: R$%.2f\n", total2);
                }
                case 3 -> {
                    System.out.print("Digite a quantidade: ");
                    int quantidadeL3 = sc.nextInt();
                    total3 = quantidadeL3 * 4.0;
                    System.out.printf("Total: R$%.2f\n", total3);
                }
                case 4 -> {
                    System.out.print("Digite a quantidade: ");
                    int quantidadeL4 = sc.nextInt();
                    total4 = quantidadeL4 * 4.5;
                    System.out.printf("Total: R$%.2f\n", total4);
                }
                case 5 -> {
                    System.out.print("Digite a quantidade: ");
                    int quantidadeL5 = sc.nextInt();
                    total5 = quantidadeL5 * 5.0;
                    System.out.printf("Total: R$%.2f\n", total5);
                }
                case 6 -> {
                    System.out.print("Digite a quantidade: ");
                    int quantidadeL6 = sc.nextInt();
                    total6 = quantidadeL6 * 6.0;
                    System.out.printf("Total: R$%.2f\n", total6);
                }
            }

            System.out.println("_____________________________________________");
            System.out.println("Deseja fazer mais um pedido s(sim) e n(não)?");
            System.out.print("R: ");
            pergunta1 = sc.next().charAt(0);
        } while (pergunta1 == 's');

        System.out.println("----------------------------------------------");
        double total7 = 0, total8 = 0, total9 = 0;

        char pergunta2;
        do {
            System.out.print("Digite o código da bebida: ");
            int codigoB = sc.nextInt();

            switch (codigoB) {
                case 7 -> {
                    System.out.print("Digite a quantidade: ");
                    int quantidadeB7 = sc.nextInt();
                    total7 = quantidadeB7 * 1.5;
                    System.out.printf("Total: R$%.2f\n", total7);
                }
                case 8 -> {
                    System.out.print("Digite a quantidade: ");
                    int quantidadeB8 = sc.nextInt();
                    total8 = quantidadeB8 * 2.5;
                    System.out.printf("Total: R$%.2f\n", total8);
                }
                case 9 -> {
                    System.out.print("Digite a quantidade: ");
                    int quantidadeB9 = sc.nextInt();
                    total9 = quantidadeB9 * 3.5;
                    System.out.printf("Total: R$%.2f\n", total9);
                }
            }
            System.out.println("____________________________________________");
            System.out.println("Quer pedir mais uma bebida s(sim) e n(não)?");
            System.out.print("R: ");
            pergunta2 = sc.next().charAt(0);
        } while (pergunta2 == 's');

        System.out.println("\n");
        double totalL;
        totalL = total1 + total2 + total3 + total4 + total5 + total6;
        System.out.printf("total do lanche: R$%.2f\n", totalL);
        double totalB;
        totalB = total7 + total8 + total9;
        System.out.printf("total da bebida: R$%.2f\n", totalB);
        double totalT = totalB + totalL;
        System.out.printf("Total a pagar: R$%.2f\n", totalT);

        sc.close();
    }
}



