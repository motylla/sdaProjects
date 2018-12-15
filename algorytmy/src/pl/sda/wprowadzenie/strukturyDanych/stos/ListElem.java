package pl.sda.wprowadzenie.strukturyDanych.stos;

public class ListElem {

    private int value;
    private ListElem prev;
    private ListElem next;

    public ListElem(int value) {
        this.value = value;
        next = prev = null;    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListElem getPrev() {
        return prev;
    }

    public void setPrev(ListElem prev) {
        this.prev = prev;
    }

    public ListElem getNext() {
        return next;
    }

    public void setNext(ListElem next) {
        this.next = next;
    }
}
