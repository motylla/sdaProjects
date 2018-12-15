package pl.sda.wprowadzenie.strukturyDanych.stos;

public class ListList {

    private ListElem first; //head, pierwszy element w liście
    private ListElem last; //tail

    public ListList() {
        first = last = null;
    }

    public void addFirst(int wartosc) {

        ListElem newListElem = new ListElem(wartosc);
        if (first == null) {
            first = last = newListElem;
        } else {
            first.setPrev(newListElem);
            newListElem.setNext(first);
            first = newListElem;
        }

    }

    public void addLast(int wartosc) {
        ListElem newLastElem = new ListElem(wartosc);

        if (first == null) {
            first = last = newLastElem;
        } else {
            last.setNext(newLastElem);
            newLastElem.setPrev(last); //ustawiamy poprzednika na last który był jeszcze starym lastem
            last = newLastElem;
        }
    }

    public int peekFirst() {
        return first.getValue();
    }

    public int peekLast() {
        return last.getValue();
    }

    public int pollFirst() {

        if (first == null) {

            //to do excepction
        }

        if (first.getNext() == null) {
            last = null;
        }

        int value = first.getValue(); //przypisanie wartosci do pierwszego elementu, przechowanie wartosci elementu w pamięci
        first = first.getNext(); // aktualizujemy pierwszy element
        if (first != null) {
            first.setPrev(null);
        } // usunięcie powiązania do poprzedniego elementu, czyli do usuniętego pierwszego

        return value;
    }

    public int pollLast() {
        if (last == null) {

            //TODO exception
        }

        if (last.getPrev() == null) {
            first = null;
        }

        int value = last.getValue();
        last = last.getPrev();
        if (last != null) {
            last.setNext(null);
        }
        return value;
    }

    public void show() {
        ListElem listaElemTmp = first;

        while (listaElemTmp != null) {
            System.out.print(listaElemTmp.getValue() + " ");
            listaElemTmp = listaElemTmp.getNext();
        }
        System.out.println();
    }

    public void showReverse() {
        ListElem listaElemTmp = last;
        while (listaElemTmp != null) {
            System.out.print(listaElemTmp.getValue() + " ");
            listaElemTmp = listaElemTmp.getPrev();
        }
        System.out.println();
    }

    public ListElem znajdz(int wartosc) {
        ListElem listaElemTmp = first;
        while (listaElemTmp != null) {
            if (listaElemTmp.getValue() == wartosc) {
                return listaElemTmp;
            }
            listaElemTmp = listaElemTmp.getNext();
        }
        return null;
    }

    public boolean usun(int wartosc) {
        ListElem szukanaWartosc = znajdz(wartosc);

        if (szukanaWartosc == null) {
            return false;
        } else if (wartosc == first.getValue()) {
            pollFirst();
        } else if (wartosc == last.getValue()) {
            pollLast();
        } else {
            szukanaWartosc.getPrev().setNext(szukanaWartosc.getNext());
            szukanaWartosc.getNext().setPrev(szukanaWartosc.getPrev());
        }

        return true;
    }

}
