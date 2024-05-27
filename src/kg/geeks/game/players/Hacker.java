package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Hacker extends Hero {
    private int healthSteal;
    private boolean stealThisRound;

    public Hacker(int health, int damage, String name, int healthSteal) {
        super(health, damage, SuperAbility.HACK, name);
        this.healthSteal = healthSteal;
        this.stealThisRound = true;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (stealThisRound) {
            boss.setHealth(boss.getHealth() - healthSteal);
            Hero targetHero = heroes[RPG_Game.random.nextInt(heroes.length)];
            targetHero.setHealth(targetHero.getHealth() + healthSteal);
            System.out.println(this.getName() + " stole " + healthSteal + " health from the boss and gave it to " + targetHero.getName());
        }
        stealThisRound = !stealThisRound;
    }
}
