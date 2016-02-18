package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Abdullah";
////        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Abdullah", 300, "Sword");
        player.loseHealth(300);
        System.out.println(player.getHealth());
    }
}
