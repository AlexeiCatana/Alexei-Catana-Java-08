package com.sci.week_five_JavaOOP2;

public class HuaweiP40 extends Huawei {

    private static final int BATTERY_LIFE = 50;
    private String color;
    private String material;

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
