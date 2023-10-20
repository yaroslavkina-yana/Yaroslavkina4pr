package com.company.yaroslavkina;
public enum TimeOfYear {
        Лето(25),
        Осень(10),
        Зима(-5),
        Весна(15);
        private int averageTemperature;
        TimeOfYear(int averageTemperature) {
            this.averageTemperature = averageTemperature;}
        public int getAverageTemperature() {
            return averageTemperature;}
        public String getDescription() {
            switch (this) {
                case Лето:
                    return "Теплое время года";
                default:
                    return "Холодное время года";
            }
        }
}

