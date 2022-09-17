package com.example.wizard;
import com.example.hero.Hero;

public class Wizard {
    public String name;
    public int hp;
    public void heal(Hero h) {
        h.hp += 10;
        System.out.println(this.name+ "が、" + h.name + "のHPを10回復した！");
    }
}
