package br.com.array;

/**
 * Estudo do Array - exemplo 6 - Array multidimensional
 *
 * @author Henrique Souza
 */
public class Array6 {

    public static void main(String[] args) {
        //a linha abaixo cria um array de duas dimensões com 3 linhas e 3 colunas
        String[][] agenda = {{"Bill", "1111-1111", "bill@outlook.com"}, {"Linus", "2222-2222", "linus@tux.com"}, {"Steve", "3333-3333", "steve@icloud.com"}};
        //exemplo 1 recuperando o email do Bill
        //System.out.println(agenda[0][2]);
        //montando a agenda de contatos
        //o primeira laço percorre as linhas
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("__________________________");
            //o segundo laço dentro do primeiro laço,percorre as colunas,montando a agenda
        for (int j = 0; j < agenda[i].length; j++) {
            System.out.println(agenda[i][j]);
            }
        }
    }
}
