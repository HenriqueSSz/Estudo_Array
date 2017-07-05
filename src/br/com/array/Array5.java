package br.com.array;

/**
 * Estudo do Array - exemplo - Percorrendo um array com o laço for e foreach
 *
 * @author Henrique Souza
 */
public class Array5 {

    public static void main(String[] args) {
        //instanciando um array de tamanho variável 
        int[] pares = {2, 3, 6, 8};
        //a estrutura abaixo percorre o array de 0 até o seu tamanho mâximo
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares [" + i + "] = " + pares[i]);
        }
        //usando uma estrutura simplificada do laço for(foreach) para percorrer o array
        System.out.println("Uso do foreach");
        for (int i : pares) {
            System.out.println(i);
        }
    }
}
