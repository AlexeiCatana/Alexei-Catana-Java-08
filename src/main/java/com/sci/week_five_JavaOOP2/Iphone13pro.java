package com.sci.week_five_JavaOOP2;

public class Iphone13pro extends Iphone {

    private static final int BATTERY_LIFE = 90;
    private String color;
    private String material;

    Iphone13pro(String IMEI) {
        setIMEI(IMEI);
        setCurrentBatteryLevel(BATTERY_LIFE);
    }

    public static int getBatteryLife() {
        return BATTERY_LIFE;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
