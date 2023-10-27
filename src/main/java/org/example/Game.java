package org.example;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Game {
    private int size;
    private int treasureX;
    private int treasureY;
    private int playerX;
    private int playerY;
    private int playerLife;
    public int monsterX;
    public int monsterY;
    public int monsterN;
    public ArrayList<Monster> MonsterList = new ArrayList<>();
    public int monsterType = 2;
    private boolean[][] map;
    public int movestep;
    public Game(int size){
        this.size=size;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTreasureX() {
        return treasureX;
    }

    public void setTreasureX(int treasureX) {
        this.treasureX = treasureX;
    }

    public int getTreasureY() {
        return treasureY;
    }

    public void setTreasureY(int treasureY) {
        this.treasureY = treasureY;
    }

    public int getPlayerX() {
        return playerX;
    }

    public void setPlayerX(int playerX) {
        this.playerX = playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    public void setPlayerY(int playerY) {
        this.playerY = playerY;
    }

    public int getPlayerLife() {
        return playerLife;
    }

    public void setPlayerLife(int playerLife) {
        this.playerLife = playerLife;
    }

    public void StartGame(){
        generatePlayer();
        generateTreasure();
        generateMonster();
        do {
            Move();
            CheckPosition();
        }while(this.playerLife >0);
    }

    public void generatePlayer(){
        setPlayerlife();
        Random rand = new Random();
        this.playerX = rand.nextInt(size);
        this.playerY = rand.nextInt(size);
        System.out.println("Your starting position is at ["+ playerX + ", " + playerY + "]");
        map = new boolean[size][size];
        for(int i = 0;i <size;i++){
            for(int j= 0;j <size;j++ ){
                map[i][j] = true;
            }
        }
        map[playerX][playerY] = false;
    }

    public void setPlayerlife(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input player life");
        this.playerLife = scanner.nextInt();
    }

    public void generateTreasure(){
        Random rand = new Random();
        this.treasureX = playerX;
        this.treasureY = playerY;
        do {
            treasureX = rand.nextInt(size);
            treasureY = rand.nextInt(size);
//        }while (playerX == treasureX && playerY== treasureY);
          }while (!map[treasureX][treasureY]);
        map[treasureX][treasureY] = false;
        System.out.println("Treasure position is at ["+ treasureX + ", " + treasureY + "]");
    }

    public void generateMonster(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Monster number you want to generate");
        this.monsterN = scanner.nextInt();
        Random rand = new Random();
        for(int i = 1; i<=monsterN; i++){
            monsterX = rand.nextInt(size);
            monsterY = rand.nextInt(size);
            if(rand.nextInt(monsterType) == 0){
                do {
                    monsterX = rand.nextInt(size);
                    monsterY = rand.nextInt(size);
                }while(!map[monsterX][monsterY]);
                map[monsterX][monsterY] = false;
                RedBuff rd1 = new RedBuff(true, monsterX, monsterY, 1);
                MonsterList.add(rd1);
                System.out.println("Redbuff position is at ["+ rd1.getMonsterX()+ ", " + rd1.getMonsterY() + "]");
            }else{
                do {
                    monsterX = rand.nextInt(size);
                    monsterY = rand.nextInt(size);
                }while(!map[monsterX][monsterY]);
                map[monsterX][monsterY] = false;
                Dragon dg1 = new Dragon(false, monsterX, monsterY,2);
                MonsterList.add(dg1);
                System.out.println("Dragon position is at ["+ dg1.getMonsterX()+ ", " + dg1.getMonsterY() + "]");
            }
        }
    }
    public void Move(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose your move: 1.up 2.down 3.left 4.right ");
        movestep = scanner.nextInt();
        switch (movestep){
            case 1:
                playerY +=1;
                if(playerY >size){
                    playerY = size;
                    System.out.println("You are at boundry now, no more up move");
                }
                break;
            case 2:
                playerY -=1;
                if(playerY < 0){
                    playerY = 0;
                    System.out.println("You are at boundry now, no more down move");
                }
                break;
            case 3:
                playerX -=1;
                if(playerX < 0){
                    playerX = 0;
                    System.out.println("You are at boundry now, no more left move");
                }
                break;
            case 4:
                playerX +=1;
                if(playerX > size){
                    playerX = size;
                    System.out.println("You are at boundry now, no more right move");
                }
                break;
        }
        System.out.println("Your are at ["+ playerX + "," + playerY + "]");
    }

    public void CheckLife(){
        if (this.playerLife <=0){
            System.out.println("Lose......");
            System.exit(1);
        }
    }

    public void CheckPosition(){
        ifwin();
        ifMeetMonster();
        pointDirection();
    }

    public void ifwin(){
        if(playerX == treasureX && playerY == treasureY){
            System.out.println("Brilliant! Win the treasure!");
            System.exit(1);
        }
    }
    public void ifMeetMonster(){
        for(Monster monster: MonsterList){
            if (playerX == monster.getMonsterX() && playerY == monster.getMonsterY()){
                if (monster.getGood()){
                    playerLife += 1;
                    System.out.println("RedBuff: Give you one more life!");
                }else{
                    playerLife -=2;
                    System.out.println("Dragon: Destroy everything!");
                    CheckLife();
                }
            }
        }
    }

    public void pointDirection(){
        if(playerX <= treasureX){
            if (playerY <= treasureY){
                System.out.println(" Treasure is at your right and top");
            }else{
                System.out.println(" Treasure is at your right and down");
            }
        }else {
            if (playerY <= treasureY){
                System.out.println(" Treasure is at your left and top");
            }else{
                System.out.println(" Treasure is at your left and down");
            }
        }
    }

}
