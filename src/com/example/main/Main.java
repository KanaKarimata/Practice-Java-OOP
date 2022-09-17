package com.example.main;
import com.example.hero.Hero;
import com.example.matango.Matango;
import com.example.cleric.Crelic;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        Crelic c1 = new Crelic();
        c1.name = "Lolo";

        h.slip();
        c1.selfAid();
        c1.pray(5);
        m1.run();
        m2.run();
        h.run();

    }
}
