package pl.sda.wprowadzenie.strukturyDanych.stos;

public class StosList {

    private StosElem top;

    public StosList() {
        top = null;
    }

    public void push(int wartosc) {
        top = new StosElem(wartosc, top);

    }

    public int pop() throws StosListIndexOutException {
        if (isEmpty()) {
            throw new StosListIndexOutException("Stos pusty");
        }
        int value = top.getValue();
        top = top.getPrev(); //topem staje się poprzedni top
        return value;

    }

    public boolean isEmpty() {
        return top == null;
        //if (top==null) {return true) else {return false}

    }

    public int peek() {
        return top.getValue();

    }

    public void show() {
        StosElem elemTmp = top;
        while (elemTmp != null) {
            int wartoscNaEkran = elemTmp.getValue();
            System.out.print(wartoscNaEkran + " ");

            elemTmp = elemTmp.getPrev();
        }
        System.out.println();


    }
}
