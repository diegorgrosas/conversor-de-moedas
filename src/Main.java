import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        String moedaBase;
        String moedaAlvo;
        double quantidade;
        ConverteMoedas converteMoedas = new ConverteMoedas();
        DadosConversao dadosConversao;

        System.out.println("==============================================================================");
        System.out.println("               Bem vindos ao conversor de moedas universal!                   ");
        System.out.println("==============================================================================");

            while (opcao != 7 ) {
                System.out.println("______________________________________________________________________________");
                System.out.println("Escolha uma das opções abaixo:");
                System.out.println("1. Dolar[USD]      -->  Real[BRL]");
                System.out.println("2. Real[BRL]       -->  Dolar[USD]");
                System.out.println("3. Dolar[USD]      -->  Peso[CLP]");
                System.out.println("4. Peso[CLP]       -->  Dolar[USD]");
                System.out.println("5. Dolar[USD]      -->  Boliviano[BOB]");
                System.out.println("6. Boliviano[BOB]  -->  Dolar[USD]");
                System.out.println("7. Sair");
                System.out.println("______________________________________________________________________________");

                try {
                    System.out.print("Opção: ");
                    opcao = leitura.nextInt();

                    switch (opcao){
                        case 1:
                            moedaBase = "USD";
                            moedaAlvo = "BRL";
                            System.out.print("Valor que deseja converter: ");
                            quantidade = leitura.nextDouble();
                            dadosConversao = converteMoedas.fazConversao(moedaBase, moedaAlvo, quantidade);
                            System.out.println(quantidade + " [" + moedaBase +"] corresponde a " + dadosConversao.quantidade() + " [" + moedaAlvo + "]" );
                            break;
                        case 2:
                            moedaBase = "BRL";
                            moedaAlvo = "USD";
                            System.out.print("Valor que deseja converter: ");
                            quantidade = leitura.nextDouble();
                            dadosConversao = converteMoedas.fazConversao(moedaBase, moedaAlvo, quantidade);
                            System.out.println(quantidade + " [" + moedaBase +"] corresponde a " + dadosConversao.quantidade() + " [" + moedaAlvo + "]" );
                            break;
                        case 3:
                            moedaBase = "USD";
                            moedaAlvo = "CLP";
                            System.out.print("Valor que deseja converter: ");
                            quantidade = leitura.nextDouble();
                            dadosConversao = converteMoedas.fazConversao(moedaBase, moedaAlvo, quantidade);
                            System.out.println(quantidade + " [" + moedaBase +"] corresponde a " + dadosConversao.quantidade() + " [" + moedaAlvo + "]" );
                            break;
                        case 4:
                            moedaBase = "CLP";
                            moedaAlvo = "USD";
                            System.out.print("Valor que deseja converter: ");
                            quantidade = leitura.nextDouble();
                            dadosConversao = converteMoedas.fazConversao(moedaBase, moedaAlvo, quantidade);
                            System.out.println(quantidade + " [" + moedaBase +"] corresponde a " + dadosConversao.quantidade() + " [" + moedaAlvo + "]" );
                            break;
                        case 5:
                            moedaBase = "USD";
                            moedaAlvo = "BOB";
                            System.out.print("Valor que deseja converter: ");
                            quantidade = leitura.nextDouble();
                            dadosConversao = converteMoedas.fazConversao(moedaBase, moedaAlvo, quantidade);
                            System.out.println(quantidade + " [" + moedaBase +"] corresponde a " + dadosConversao.quantidade() + " [" + moedaAlvo + "]" );
                            break;
                        case 6:
                            moedaBase = "BOB";
                            moedaAlvo = "USD";
                            System.out.print("Valor que deseja converter: ");
                            quantidade = leitura.nextDouble();
                            dadosConversao = converteMoedas.fazConversao(moedaBase, moedaAlvo, quantidade);
                            System.out.println(quantidade + " [" + moedaBase +"] corresponde a " + dadosConversao.quantidade() + " [" + moedaAlvo + "]" );
                            break;
                        case 7:
                            System.out.println("Operação encerrada!");
                            System.out.println();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida.");
                    leitura.nextLine();
                }
            }
    }
}