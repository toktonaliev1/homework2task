package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(name(14,27));
        System.out.println(name(45,34));
        System.out.println(name(5,10));
        System.out.println(name(40,22));
        System.out.println(name(7,26));
    }
    public static String name (int age, int temperature){
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30){
            return "Можно идти гулять";

        }else if (age < 20 && temperature > 0 && temperature < 28){
            return "Можно идти гулять";

        }if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";

        }else
            return "Оставайтесь дома";
        }
    }



