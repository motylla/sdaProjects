package pl.sda.oop.model;

public class user
{

    private String name;
    private String lastname;
    private int age;
    private BankAccount bankAccount;
    private Car car;  //pole




    public user(String name, String lastname, int age, BankAccount bankAccount) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.bankAccount = bankAccount;
        this.car = car; //inicjalizacja pola

    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Car getCar() {
        return car;
    }

    public String getCarModel () {
        return car.getModel();
    }

    public int getCarSpeed () {
        return getCarSpeed();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getBankAccountGetName () {
        return bankAccount.getBankName();
    }

    public int getBankAccountAccountNumber (){
        return bankAccount.getAccountNumber();

    }

    public double getBankAccountBalance () {
        return bankAccount.getBalance();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    /* public user(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;

    }

    public String getName() {
        return name; //getter metody pozwalajace na pobranie wartosci
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setLastname (String lastname) {
        this.lastname = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    */
}
