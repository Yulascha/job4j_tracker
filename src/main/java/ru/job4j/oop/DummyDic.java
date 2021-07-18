package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        eng = "слово";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic eng = new DummyDic();
        System.out.println("Неизвестное слово. " + eng);
    }
}