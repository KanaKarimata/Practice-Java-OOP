package com.example.main;
import com.example.hero.Hero;
import com.example.matango.Matango;
import com.example.cleric.Crelic;
import com.example.wizard.Wizard;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト");
//        h.name = "ミナト";
        h.hp = 100;

        Hero h2 = new Hero();
        System.out.print(h2.name);
        System.out.println(h2.hp);

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        Crelic c1 = new Crelic();
        c1.name = "Lolo";

        Wizard w = new Wizard();
        w.name = "Rara";
        w.hp = 50;

        h.slip();
        w.heal(h);
        c1.selfAid();
        c1.pray(5);
        m1.run();
        m2.run();
        h.run();

    }
}
