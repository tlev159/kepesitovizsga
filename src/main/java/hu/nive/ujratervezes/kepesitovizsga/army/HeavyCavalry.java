package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

  private int counter = 0;

  public HeavyCavalry() {
    super(150, 20, true);
  }


  @Override
  public int doDamage() {
    if (counter < 1) {
      counter++;
      return damagePoints * 3;
    } else {
      counter++;
      return damagePoints;
    }
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
