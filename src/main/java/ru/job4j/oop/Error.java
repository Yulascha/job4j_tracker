package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("активный " + active);
        System.out.println("статус " + status);
        System.out.println("сообщение " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error err = new Error(true, 1, "online");
        err.printInfo();
        Error print = new Error(false, 9, "text");
        print.printInfo();
    }
}
