import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = null;


        while (true) {
            System.out.println("===BEM VINDO===");
            System.out.println("1- Criar Conta");
            System.out.println("2- Exibir Informações");
            System.out.println("3- Depositar");
            System.out.println("4- Sacar");
            System.out.println("5- Saldo");
            System.out.println("0- Sair");

            int opcao = scanner.nextInt();
            switch (opcao) {

                case 1:
                    if (contaBancaria != null) {
                        System.out.println("Conta Criada");
                        break;
                    } else {
                        scanner.nextLine();
                        System.out.println("Nome Titular: ");
                        String nome = scanner.nextLine();
                        System.out.println("Numero Da Conta");
                        int numeroConta = scanner.nextInt();
                        contaBancaria = new ContaBancaria(numeroConta, nome);
                    }
                    System.out.println("Conta Criada Com Sucesso!");
                    break;

                case 2:
                    if (contaBancaria == null) {
                        System.out.println("Crie uma Conta Primeiro11");
                        break;
                    }else {
                        contaBancaria.exibirInformacoes();
                    }break;

                case 3:
                    if (contaBancaria == null) {
                        System.out.println("Crie uma Conta Primeiro");
                        break;
                    }
                    System.out.println("Qual valor você quer Depositar?");
                    double valorDeposito = scanner.nextDouble();
                    contaBancaria.depositar(valorDeposito);
                    break;

                case 4:
                    if (contaBancaria == null) {
                        System.out.println("Crie uma Conta Primeiro");
                        break;
                    }
                    System.out.println("Qual Valor Você Quer Sacar?");
                    double valorSacar = scanner.nextDouble();
                    contaBancaria.sacar(valorSacar);
                    break;

                case 5:
                    if (contaBancaria == null) {
                        System.out.println("Crie uma Conta Primeiro");
                        break;
                    }else {
                        System.out.println("===Saldo===");
                        System.out.println(contaBancaria.getSaldo());
                        break;
                    }
                case 0:
                    scanner.close();
                    return;
            }
        }
    }
}