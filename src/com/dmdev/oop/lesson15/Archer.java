package com.dmdev.oop.lesson15;

import com.dmdev.oop.lesson18.weapon.RangeWeapon;

import javax.swing.*;
import java.util.Random;

public class Archer <T extends RangeWeapon> extends Hero <T> {
    private Wolf wolf;


    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
           }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+ " стрельнул из лука в "+ enemy.getName());
        wolf.attackEnemy(enemy);
    }
    private class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }
        public void attackEnemy (Enemy enemy) {
            System.out.println(name + " " + Archer.this.getName() + " наносят совместный урон");
            enemy.takeDamage(damage+ Archer.this.getDamage());

        }
    }
}
