package org.example;

public class Main {
    public static void main(String[] args) {
        int TicketCost=13676;
        int MilesPerRuble=20;
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        int BonusMiles=TicketCost/MilesPerRuble;
        
        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        System.out.println("BonusMiles"+BonusMiles);
    }
}