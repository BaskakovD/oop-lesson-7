package com.dmdev.oop.lesson15;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("�������", 15);
        //warrior.attackEnemy();

        Hero mage = new Mage("��������", 20);
        //mage.attackEnemy();

        Hero archer = new Archer("�������", 30);
        //archer.attackEnemy();
        //Archer.Wolf wolf = new Archer.Wolf("Second wolf", 11);
        Enemy enemy = new Enemy("�����", 100);
        attackEnemy(enemy, warrior, mage, archer);
    }


    public static void attackEnemy (Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero: heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }

            
        }
        
    }
}
