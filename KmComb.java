import java.util.Scanner;

public class KmComb {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kmTotal = 0;
        int consumoTotal = 0;
        int contadorViagem = 1;
        int consumoViagem = 0;

        System.out.println("----------------------------------------------------------------------");
        System.out.println("|                    Calculadora de consumo v 0.1                    |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.println("O consumo de combustível é uma preocupação para todos os motoristas.");
        System.out.println("Para auxiliá-los, esta calculadora de consumo foi desenvolvida: com ");
        System.out.println("base em informações inseridas pelo condutor, o programa faz uma mé-");
        System.out.println("dia de consumo em km/l por viagem e o total de km percorridos e quan-");
        System.out.println("tidade de combustível consumida (em uma ou mais viagens).");
        System.out.println();
        System.out.println("Forneça como resposta -1 na quilometragem a qualquer momento para ");
        System.out.println("obter o cálculo e finalizar o programa.");
        System.out.println();

        System.out.printf("Insira os dados da viagem %d%n", contadorViagem);
        System.out.println("Total de km percorridos: ");
        int kmViagem = input.nextInt();

        if (kmViagem != -1) {
            System.out.println("Combustível consumido (em litros): ");
            consumoViagem = input.nextInt();

            System.out.printf("A autonomia do veículo na viagem %d foi de: %.2f km/l%n%n",
                    contadorViagem, ((double) kmViagem / consumoViagem));

            contadorViagem++;
        }

        while (kmViagem != -1) {
            kmTotal += kmViagem;
            consumoTotal += consumoViagem;

            System.out.printf("Insira os dados da viagem %d%n", contadorViagem);
            System.out.println("Total de km percorridos: ");
            kmViagem = input.nextInt();

            if (kmViagem != -1) {
                System.out.println("Combustível consumido (em litros): ");
                consumoViagem = input.nextInt();

                System.out.printf("A autonomia do veículo na viagem %d foi de: %.2f km/l%n%n",
                        contadorViagem, ((double) kmViagem / consumoViagem));

                contadorViagem++;
            }

        }

        if (kmTotal != 0 && consumoTotal != 0) {
            System.out.printf("O total percorrido é %d km e o consumo total de combustível é %d litros.%n",
                    kmTotal, consumoTotal);
        } else {
            System.out.println("Nenhum dado foi inserido, finalizando calculadora");
        }
    }
}
