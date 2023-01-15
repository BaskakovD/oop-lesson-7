package com.dmdev.oop.lesson15;

import javax.sound.midi.SoundbankResource;

public class Mage <T> extends Hero <T>{
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+ " cотворил заклинание "+ enemy.getName());
        enemy.takeDamage(getDamage());
    }

}
