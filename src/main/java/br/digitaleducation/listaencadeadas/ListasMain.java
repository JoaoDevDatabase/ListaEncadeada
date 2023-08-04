package br.digitaleducation.listaencadeadas;

public class ListasMain {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada<>();
        lista.add("conteudo um");
        lista.add("conteudo dois");
        lista.add("conteudo tres");
        lista.add("conteudo quatro");

        System.out.println(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        System.out.println(lista.get(4));
        System.out.println(lista.get(5));
        System.out.println(lista.remove(5));


    }
}
