package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

  protected int hitPoints;
  protected int damagePoints;
  protected boolean panzer;

  public MilitaryUnit(int hitPoints, int damagePoints, boolean panzer) {
    this.hitPoints = hitPoints;
    this.damagePoints = damagePoints;
    this.panzer = panzer;
  }

  public abstract int doDamage();

  public abstract void sufferDamage(int damage);

  public int getHitPoints() {
    return hitPoints;
  }

  public int getDamagePoints() {
    return damagePoints;
  }

  public boolean isPanzer() {
    return panzer;
  }
}
