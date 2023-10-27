package org.example;

public class Dragon extends Monster{
    private int damage;

    public Dragon(Boolean isGood, int monsterX, int monsterY, int damage) {
        super(isGood, monsterX, monsterY);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


}
