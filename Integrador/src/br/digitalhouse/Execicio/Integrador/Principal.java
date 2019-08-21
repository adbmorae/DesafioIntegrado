package br.digitalhouse.Execicio.Integrador;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Livro>livro = new ArrayList<>();

        Livro livro1 = new Livro(1," Foda "," João ",2019,11);
        Livro livro2 = new Livro(2," Fodão ","Rafael " ,2019,12);
        Livro livro3 = new Livro(3, " Fudido "," Jessica ", 2019,13);
        livro.add(livro1);
        livro.add(livro2);
        livro.add(livro3);

        Livro valor = livro.get(1);
        System.out.println(valor.toString());

        Livro compra = livro.remove(1 );

        System.out.println("O " + compra + " esta sendo vendido ");

    }
}
