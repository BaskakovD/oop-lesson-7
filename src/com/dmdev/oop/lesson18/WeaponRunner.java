package com.dmdev.oop.lesson18;

import com.dmdev.oop.lesson15.Archer;
import com.dmdev.oop.lesson15.Hero;
import com.dmdev.oop.lesson15.Warrior;
import com.dmdev.oop.lesson18.weapon.MeleeWeapon;
import com.dmdev.oop.lesson18.weapon.Sword;
import com.dmdev.oop.lesson18.weapon.Weapon;

import java.util.Arrays;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer <Bow> archer = new Archer<Bow>("Леголайз", 15);
        archer.setWeapon(new Bow());

        Warrior <Sword>  warrior = new Warrior<>("Баромир", 10);
        warrior.setWeapon(new Sword());


        printWeaponDamage(archer);

    }

    public static  void printWeaponDamage (Hero <? extends Weapon> hero) {
        System.out.println(hero.getWeapon());
        System.out.println(hero.getDamage());
    }
}
