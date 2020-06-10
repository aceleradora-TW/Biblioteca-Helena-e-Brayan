package com.aceleradora.biblioteca;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] Titulos = new String[2];
        String[] Autorias = new String[2];
        Titulos[0] = "Título : Program development in Java";
        Titulos[1] = "Título : Use a Cabeça: Padrões de projeto";
        Autorias[0] = "Autoria: Barbara Liskov";
        Autorias[1] = "Autoria: Elisabeth Freeman, Kathy Sierra";

        System.out.println("Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre");
        System.out.println("Os livros disponíveis são: ");
        System.out.println("Livro 1: ");
        System.out.println(Titulos[0]);
        System.out.println(Autorias[0]);
        System.out.println("Livro 2: ");
        System.out.println(Titulos[1]);
        System.out.println(Autorias[1]);


    }
}