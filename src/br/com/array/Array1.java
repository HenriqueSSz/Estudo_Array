package br.com.array;

/**
 * Estudo do Array - exemplo - 1 Array Simples
 * @author Henrique Souza
 */
public class Array1 {
    public static void main(String[] args) {
        //sem array
        System.out.println("Array Simples");
        System.out.println("1. Sem Array");
        String time1="Palmeiras";
        String time2="Corinthians";
        String time3="São Paulo";
        String time4="Santos";
        System.out.println("Time lixo:" + time2);
        System.out.println("2. Com Array");
        //a linha abaixo cria um array simples de tamanho 4
        String[] times={"Palmeiras","Corinthians","São Paulo","Santos"};
        //a linha abaixo exibe o conteudo do array na posição [1]
        //[0][1][2][3]...
        System.out.println("Time lixo:" + times[1]);
        //a linha abaixo o ".length" exibe tamnho do array
        System.out.println("Tamanho do Array:" + times.length);
        //a linha abaixo altera o conteudo de um array
        times[1]="Flamengo";
        System.out.println("Time lixo:" + times[1]);
    }
}
