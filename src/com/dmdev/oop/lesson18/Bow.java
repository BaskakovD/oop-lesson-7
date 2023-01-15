package com.dmdev.oop.lesson18;

import com.dmdev.oop.lesson18.weapon.RangeWeapon;

public class Bow implements RangeWeapon {
    @Override
    public int getDamage() {
        return 10;
    }
}
