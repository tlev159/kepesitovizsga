package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

  public Archer() {
    super(50, 20, false);
  }

  @Override
  public int doDamage() {
    return damagePoints;
  }

  @Override
  public void sufferDamage(int damage) {
    if (isPanzer()) {
      hitPoints -= damage / 2;
    } else {
      hitPoints -= damage;
    }
  }
}
