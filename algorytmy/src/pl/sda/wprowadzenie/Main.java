package pl.sda.wprowadzenie;

import pl.sda.wprowadzenie.algorytmy.BinarySearch;
import pl.sda.wprowadzenie.algorytmy.ONP;
import pl.sda.wprowadzenie.strukturyDanych.stos.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        wywolajLista();

        //wywolajBinarySearch();


        // wywolajONP();
        //wywolajKolejkaList();
        //wywolajStosList();
        //  wywolajStosTab();


    }


    public static void wywolajLista() {

        ListList lista = new ListList();

        lista.addFirst(3);
        lista.addFirst(2);
        lista.addFirst(1);

        lista.addLast(4);
        lista.addLast(5);

        System.out.println("peek first " + lista.peekFirst());
        System.out.println("peek last " + lista.peekLast());

        lista.show();
        lista.showReverse();
        System.out.println("Czy znajduje się: " + lista.znajdz(1));

        lista.usun(3);
        lista.show();


    }

    public static void wywolajBinarySearch() {

        int tab[] = new int[]{1, 2, 3, 4, 7, 10, 16, 45, 90};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szukaną wartość");
        int szukana = scanner.nextInt();
        new BinarySearch().wyszukaj(tab, szukana);
    }

    public static void wywolajONP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyrażenie w Odwrotnej Notacji Polskiej: ");
        String wejscie = scanner.nextLine();
        String[] podzial = wejscie.split(" ");
        new ONP().run(podzial);
    }

    public static void wywolajKolejkaList() {

        KolejkaList kolejkaList = new KolejkaList();

        kolejkaList.add(1);
        kolejkaList.add(2);
        kolejkaList.add(3);

        kolejkaList.show();

        System.out.println("peek: " + kolejkaList.peek());

        kolejkaList.poll();
        kolejkaList.poll();

        kolejkaList.show();

        kolejkaList.add(4);
        kolejkaList.add(5);

        kolejkaList.show();

        System.out.println("KONIEC");


    }

    public static void wywolajStosList() {
        StosList stosList = new StosList();

        stosList.push(1);
        stosList.push(2);
        stosList.push(3);

        stosList.show();

        try {
            stosList.pop();
        } catch (StosListIndexOutException e) {
            System.out.println(e.getMessage());
        }

        stosList.show();

        stosList.push(4);
        stosList.push(5);

        stosList.show();

        try {
            stosList.pop();
            stosList.pop();
            stosList.pop();
            stosList.pop();
            stosList.pop();
        } catch (StosListIndexOutException e) {
            System.out.println(e.getMessage());
        }


        stosList.show();

        System.out.println("KONIEC");


    }

    public static void wywolajStosTab() {
        Scanner scanner = new Scanner(System.in);
        int tab[];
        int rozmiar;
        stosTab StosTab;

        System.out.println("Podaj rozmiar tablicy");
        rozmiar = scanner.nextInt();
        tab = new int[rozmiar];
        StosTab = new stosTab(rozmiar);

        System.out.println("Podaj elementy tablicy");

        while (true) {
            System.out.println("1 - push, 2 - pop, 3 - peek, 4 - show, 0 - wyjscie");
            int operacja = scanner.nextInt();

            switch (operacja) {
                case 0:
                    return;
                case 1:
                    System.out.println("Podaj wartość na stos");
                    int w = scanner.nextInt();

                    try {
                        StosTab.push(w);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Tablica pełna!");
                    }

                    break;
                case 2:
                    try {
                        System.out.println("pop " + StosTab.pop());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Tablica pusta!");
                    }

                    break;
                case 3:
                    System.out.println("peek " + StosTab.peek());
                    break;
                case 4:
                    StosTab.show();
                    break;


            }
        }


    }
}
