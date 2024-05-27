package kg.geeks.game.players;

public class Witcher extends Hero {
    private boolean usedRevive;

    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.REVIVE, name);
        this.usedRevive = false;
    }

    @Override
    public void attack(Boss boss) {
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (!usedRevive) {
            for (Hero hero : heroes) {
                if (hero.getHealth() <= 0) {
                    hero.setHealth(this.getHealth());
                    this.setHealth(0);
                    usedRevive = true;
                    System.out.println(this.getName() + " revived " + hero.getName() + " and sacrificed himself!");
                    break;
                }
            }
        }
    }
}
