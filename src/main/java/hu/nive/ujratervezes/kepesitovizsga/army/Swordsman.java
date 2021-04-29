package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

  private int counter = 0;
  private boolean shield = true;

  public Swordsman(boolean hasPanzer) {
    super(100, 10, hasPanzer);
  }

  @Override
  public int doDamage() {
    return damagePoints;
  }

  @Override
  public void sufferDamage(int damage) {
    if (isShield()) {
      hasSwordsmanAShield();
    } else if (!isShield() && isPanzer()) {
      noShieldButPanzer(damage);
    } else if (!isShield() && !isPanzer()) {
      counter++;
      hitPoints -= damage;
    }
  }

  private void noShieldButPanzer(int damage) {
    if (counter < 2) {
      counter++;
      hitPoints -= damage / 2;
    } else {
      counter++;
      hitPoints -= damage;
    }
  }

  private void hasSwordsmanAShield() {
      shield = false;
      counter++;
    }

    public boolean isShield () {
      return shield;
    }
  }
