package com.example.hero;

public class Hero {
    public String name;
    public int hp;

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }

    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }

    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ");
    }

    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAME OVER");
        System.out.println("最終HPは、" + this.hp + "でした");
    }

    public Hero(String name) {
        this.hp = 100;
        this.name = name; //引数の値でnameフィールドを初期化
    }

    public Hero() {
//        this.hp = 100;
//        this.name = "ダミー";
        this("ダミー");
    }

}
