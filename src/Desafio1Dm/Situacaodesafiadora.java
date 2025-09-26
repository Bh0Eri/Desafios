import java.lang.String;
import java.util.Scanner;

public class Situacaodesafiadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Obrigatorios !
        double salariobruto, salarioliquido;

        // Descontos
        double inss = 0, ir = 0, saude = 0;

        // Opcionais
        double vt , vr , va ;

        System.out.printf("Insira o sálario bruto para calcular:");
        salariobruto = sc.nextDouble(); // Entrada do sálario

        System.out.println("Insira quantos filhos você possui?");
        int filho = sc.nextInt();

        //Alíquotas do INSS

        //Alíquotas de 8%
        if (salariobruto <= 1302.00) {
            inss = (salariobruto * 0.08);
            System.out.printf("%nSeu salário é descontado em 8 porcento do INSS que é: %.2f%n", inss);

        } // Alíquota de 9%
        else if (salariobruto <= 2571) {
            inss = (salariobruto * 0.09);
            System.out.printf("%nSeu salário é descontado em 9 porcento do INSS que é: %.2f%n", inss);

        } // Alíquota de 11%
        else if (salariobruto <= 3856) {
            inss = (salariobruto * 0.11);
            System.out.printf("%nSeu salário é descontado em 11 porcento do INSS que é: %.2f%n", inss);

        } //Alíquota de 14%
        else {
            inss = (salariobruto * 0.14);
            System.out.printf("%nSeu salário é descontado em 14 porcento do INSS que é:%.2f%n", inss);
        }

        // Desconto do Imposto de renda (IR)

        // Alíquota Isento
        if (salariobruto <= 1903.98) {
            System.out.println("O imposto de renda de seu salário é Isento");
        }
        // Alíquota 7.5
        else if (salariobruto <= 2826.65) {
            ir = (salariobruto * (7.5 / 100))-142.8;
            ir -= (filho * 189.59);
            System.out.printf("O imposto de renda do seu salário é 7,5 porcento que é:%.2f%n", ir);
        }
        // Alíquota 15%
        else if (salariobruto <= 3751.05) {
            ir = (salariobruto * (0.15))-354.8;
            ir -= (filho * 189.59);
            System.out.printf("O imposto de renda do seu salário é 15 porcento que é: %.2f%n", ir);
        }// Alíquota 22.5%
        else if (salariobruto <= 4664.68) {
            ir = (salariobruto * (22.5 / 100))-636.13;
            ir -= (filho * 189.59);
            System.out.printf("O imposto de renda do seu salário é 22,5 porcento que é: %.2f%n", ir);
        }// Alíquota 27,5%
        else {
            ir = (salariobruto * (27.5 / 100))-869.36;
            ir -= (filho * 189.59);
            System.out.printf("O imposto de renda do seu salário é 27,5 porcento, que é: %.2f%n", ir);
        }
        // Vale transporte
        String opcao;
        while (0 < 1) {
            System.out.printf("Você possui Vale transporte?%n [Sim] %n [Não]%n R:");
            opcao = sc.next().toLowerCase();
            if (opcao.equals("sim")) {
                vt = salariobruto * (0.06);
                System.out.printf("Seu desconto de VT: %.2f%n", vt);
                break;
            } else if (opcao.equals("não") || opcao.equals("nao")) {
                System.out.println("Você não possui desconto de VT");
                vt= 0;
                break;
            } else {
                System.out.println("Digite corretamente, Repetindo...");
            }
        }
        // VA
        while (0 < 1) {
            System.out.printf("%nVocê possui Vale Alimentação?%n [Sim] %n [Não]%n R:");
            opcao = sc.next().toLowerCase();
            if (opcao.equals("sim")) {
                va = 200;
                System.out.printf("Seu desconto de VA: %.2f%n", va);
                break;
            } else if (opcao.equals("não") || opcao.equals("nao")) {
                System.out.println("Você não possui desconto de VA");
                va = 0;
                break;
            } else {
                System.out.println("Digite certo, Repetindo...");
            }
        }
        // VR
        while (0 < 1) {
            System.out.printf("Você possui Vale Refeição?%n [Sim] %n [Não]%n R:");
            opcao = sc.next().toLowerCase();
            if (opcao.equals("sim")) {
                vr = 250;
                System.out.printf("Seu desconto de VR: %.2f%n", vr);
                break;
            } else if (opcao.equals("não") || opcao.equals("nao")) {
                System.out.println("Você não possui desconto de VR");
                vr = 0;
                break;
            } else {
                System.out.println("Digite certo, Repetindo...");
            }
        }
        // Plano de saúde
        while (0 < 1) {
            System.out.printf("Você possui Plano de saúde?%n [Sim] %n [Não]%n R:");
            opcao = sc.next().toLowerCase();
            if (opcao.equals("sim")) {
                System.out.printf("Plano Básico ou Avançado? %n");
                String plano = sc.next().toLowerCase();
                if (plano.equals("basico") || plano.equals("básico")) {
                    System.out.println("Descontado em R$150,00");
                    saude = 150;
                    break;
                } else if (plano.equals("avancado") || plano.equals("avançado")) {
                    System.out.println("Descontado em R$300,00");
                    saude = 300;
                    break;
                } else {
                    System.out.println("Digite certo, Repetindo...");
                }
            } else if (opcao.equals("não") || opcao.equals("nao")) {
                System.out.println("Você não possui desconto de Plano de saúde");
                saude = 0;
                break;
            } else {
                System.out.println("Digite certo, Repetindo...");
            }
        }
        System.out.println("seu salario bruto é: "+salariobruto+"R$");
        System.out.printf("Seus descontos são:%n");
        System.out.printf("%.2f",inss," desconto do Inss%n");
        System.out.printf("%.2f",ir," De Imposto de renda%n");
        System.out.println(vr+" De vale refeição");
        System.out.println(va+" De vale alimentação");
        System.out.println(saude+" De saúde");
        System.out.println(vt+ " Vale transporte");


        salarioliquido = salariobruto - (vr + va + vt + saude + inss + ir);
        System.out.printf("%nSeu salário liquído será de: R$ %.2f%n", salarioliquido,"R$");

    }
}