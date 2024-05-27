package kg.geeks.game.players;

import java.util.Random;

public class Boss extends GameEntity {
    private SuperAbility defence;

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public SuperAbility getDefence() {
        return defence;
    }

    public void chooseDefence() {
        SuperAbility[] abilities = SuperAbility.values();
        Random random = new Random();
        int randomIndex = random.nextInt(abilities.length);
        this.defence = abilities[randomIndex];
    }

    public void attack(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setHealth(hero.getHealth() - this.getDamage());
            }
        }
    }

    @Override
    public String toString() {
        return "Boss health: " + this.getHealth() + " damage: " + this.getDamage() + " defence: " + this.defence;
    }
}
