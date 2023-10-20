package com.company.yaroslavkina;
public class Main {
        public static void main(String[] args) {
            TimeOfYear favoriteSeason = TimeOfYear.Лето;
            System.out.println("Я люблю " + favoriteSeason);
            for (TimeOfYear season : TimeOfYear.values()) {
                System.out.println("Время года: " + season);
                System.out.println("Средняя температура: " + season.getAverageTemperature());
                System.out.println("Описание: " + season.getDescription());
            }
        }
}

