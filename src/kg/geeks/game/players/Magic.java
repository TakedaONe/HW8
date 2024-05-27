package kg.geeks.game.players;

public class Magic extends Hero {
    private int attackIncrease;

    public Magic(int health, int damage, String name, int attackIncrease) {
        super(health, damage, SuperAbility.BOOST, name);
        this.attackIncrease = attackIncrease;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setDamage(hero.getDamage() + attackIncrease);
            }
        }
        System.out.println(this.getName() + " increased attack by " + attackIncrease);
    }
}
