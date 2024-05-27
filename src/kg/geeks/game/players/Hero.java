package kg.geeks.game.players;

public abstract class Hero extends GameEntity {
    private SuperAbility ability;

    public Hero(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, name);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public abstract void applySuperPower(Boss boss, Hero[] heroes);
}
