package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

  private List<MilitaryUnit> army = new ArrayList<>();

  public void addUnit(MilitaryUnit militaryUnit) {
    army.add(militaryUnit);
  }

  public void damageAll(int damage) {
    List<MilitaryUnit> temp = new ArrayList<>();
    for (MilitaryUnit unit:army) {
      unit.sufferDamage(damage);
      if (unit.getHitPoints() < 25) {
        temp.add(unit);
      }
    }
    army.removeAll(temp);
  }

  public int getArmyDamage() {
    int result = 0;
    for (MilitaryUnit unit:army) {
      result += unit.doDamage();
    }
    return result;
  }

  public int getArmySize() {
    return army.size();
  }
}
