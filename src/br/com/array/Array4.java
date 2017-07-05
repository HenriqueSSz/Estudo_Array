package br.com.array;

/**
 * Estudo do Array - exemplo 4 - preenchendo um array com o laço for
 * @author Henrique Souza
 */
public class Array4 {
    public static void main(String[] args) {
        int[] idades = new int[10];
        //a estrutura abaixo cria as variáveis que irão preencher as 10 posições ("casinhas") do array
        for (int i = 0; i < 10; i++) {
            idades[i] = i*10;
            System.out.println("intervalo de idades[" + i + "] = " + idades[i]);
        }
    }
}
