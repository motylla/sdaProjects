package pl.sda.oop;

import pl.sda.oop.model.BankAccount;
import pl.sda.oop.model.user;
import pl.sda.oop.model.Car;

public class Main {



    public static void main(String[] args) {

        BankAccount bank = new BankAccount(1, 5555, 655, "BankDlaBogatych");
        BankAccount bank2 = new BankAccount(2, 4444, 6532455, "BankNowoczesny");
        BankAccount bank3 = new BankAccount(3, 3333, 234234, "Bank");
        BankAccount bank4 = new BankAccount(4, 2222, 2342, "BigBank");


        user student = new user ("Jan", "Kowalski",44, bank);

        System.out.println(student.getName());
        System.out.println(student.getLastname());
        System.out.println(student.getAge());
        System.out.println(student.getBankAccountGetName());
        System.out.println(student.getBankAccountAccountNumber());
        System.out.println(student.getBankAccountBalance());

        user student2 = new user ("Marcin", "Nowak",66, bank2);
        user student3 = new user ("Katarzyna", "Dobroń",33, bank3);
        user student4 = new user ("Ola", "Lewandowska",33, bank4);

        // pierwsze ćwiczenie
        /*BankAccount bank = new BankAccount (1, 76345765, 32.77);
        BankAccount bank2 = new BankAccount(2, 453637, 33.98);
        Car car = new Car ("Mazda", "V8", 7643.85, 300);
        Car car2 = new Car ("Audi", "RX", 7866.88, 344);

        user student = new user("Jan", "Kowalski", 23, bank, car);

        System.out.println(student.getCar());
        System.out.println(student.getCarModel());
        System.out.println(student.getBankAccount());
        System.out.println(student.getBankAccountAccountNumber());
        System.out.println(student.getBankAccountBalance());
        System.out.println(student.getName());
        System.out.println(student.getLastname());
        System.out.println(student.getAge());
        student.setName("Maciej");
        System.out.println(student.getName());
        student.setLastname("Smith");
        System.out.println(student.getLastname());
        student.setAge(30);
        System.out.println(student.getAge());

        System.out.println("");
        user student2 = new user("Karol", "Nowak", 25, bank2, car2);

        System.out.println(student2.getName());
        System.out.println(student2.getLastname());
        System.out.println(student2.getAge()); */




    }
}
