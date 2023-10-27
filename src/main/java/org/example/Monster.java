package org.example;

public class Monster {
    private Boolean isGood;
    public int monsterX;
    public int monsterY;

    public Monster(Boolean isGood, int monsterX, int monsterY) {
        this.isGood = isGood;
        this.monsterX = monsterX;
        this.monsterY = monsterY;
    }

    public Boolean getGood() {
        return isGood;
    }

    public void setGood(Boolean good) {
        isGood = good;
    }

    public int getMonsterX() {
        return monsterX;
    }

    public void setMonsterX(int monsterX) {
        this.monsterX = monsterX;
    }

    public int getMonsterY() {
        return monsterY;
    }

    public void setMonsterY(int monsterY) {
        this.monsterY = monsterY;
    }
}
