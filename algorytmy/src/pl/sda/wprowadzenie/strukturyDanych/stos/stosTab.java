package pl.sda.wprowadzenie.strukturyDanych.stos;

public class stosTab {
    private int[] tab;
    private int top;

    public stosTab(int rozmiar) {
        tab = new int[rozmiar];
        top = -1;
    }

    public void push(int wartosc) throws  ArrayIndexOutOfBoundsException{
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        tab[++top] = wartosc; //najpierw zwiekszamy wartosc a potem odwolujemy sie do tablicy (top = top +1, czyli 0)

    }

    public int pop () throws  ArrayIndexOutOfBoundsException {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return tab[top--]; //najpierw pobieramy wartosc a potem zmniejszamy top
    }

    public boolean isEmpty() {
        return top == -1;

    }
    public boolean isFull() {
        return top == tab.length -1;
    }

    public int peek() {
        return tab[top];
    }

    public void show() {
        for (int i = 0; i <= top; i++) { //top dlatego, by wyswietlac tylko elementy tablicy, wyswietli tylko elementy ktore sa na stosie
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
