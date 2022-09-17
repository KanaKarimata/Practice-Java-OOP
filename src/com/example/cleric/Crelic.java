package com.example.cleric;

public class Crelic {
    public String name;
    public int hp = 50;
    public final int MAXHP = 50;
    public int mp = 10;
    public final int MAXMP = 10;

    public void selfAid() {
        System.out.println(this.name + "が、セルフエイドを使った！");
        this.mp -= 5;
        this.hp = this.MAXHP;
        System.out.println(this.name + "のMPは、" + this.mp + "となり、HPを最大にすることに成功した！");
    }

    public int pray(int sec) {
        System.out.println(this.name + "が" + sec + "秒、祈りを発動した！");
        int recoverMP = new java.util.Random().nextInt(3) + sec;
        int recoverActual = Math.min(this.MAXHP - this.mp, recoverMP);

        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した");
        return recoverActual;
    }
 }
