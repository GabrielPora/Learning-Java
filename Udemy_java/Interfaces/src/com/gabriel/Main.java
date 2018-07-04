package com.gabriel;

public class Main {

    public static void main(String[] args) {
        ITelephone gabrielPhone;
        gabrielPhone = new DeskPhone(987654321);
        gabrielPhone.powerOn();
        gabrielPhone.callPhone(987654321);
        gabrielPhone.answer();

        gabrielPhone = new MobilePhone(123456);
        gabrielPhone.powerOn();
        gabrielPhone.callPhone(123456);
        gabrielPhone.answer();
    }
}
