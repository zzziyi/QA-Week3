package org.example;

public class RedBuff extends Monster{
    private int reborn = 1;

    public RedBuff(Boolean isGood, int monsterX, int monsterY, int reborn) {
        super(isGood, monsterX, monsterY);
        this.reborn = reborn;
    }

    public int getReborn() {
        return reborn;
    }

    public void setReborn(int reborn) {
        this.reborn = reborn;
    }

    @Override
    public int getMonsterX() {
        return monsterX;
    }
    @Override
    public int getMonsterY() {
        return monsterY;
    }


}
