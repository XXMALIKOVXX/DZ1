package org.example;

public class Main {
    public static void main(String[] args) {
        int ticketCost = 13676;
        int milesPerRuble = 20;
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        int bonusMiles = ticketCost / milesPerRuble;

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        System.out.println("bonusMiles" + bonusMiles);
    }
}