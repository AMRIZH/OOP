package UAS.UAS2022;

import UAS.UAS2022.Action.Walk;

public interface Action {
  public void move();

  /**
   * Walk
   */
  public interface Walk extends Action{
    public String[] directions = {"forward", "backward","left", "right"};
    void speedUp();
  }
}

/**
 * Player
 */
class Player implements Walk{
  @Override
  public void speedUp() {
    System.out.println("Player move faster");
  }
  @Override
  public void move() {
    System.out.println("Player is Moving");
  }
  public void printDirections() {
    System.out.print("Directions: ");
    for(String dir : directions) {
        System.out.print(dir + " ");
    }
}
  public static void main(String[] args) {
    Player p = new Player();
    p.speedUp();
    p.move();
    p.printDirections();
  }
}