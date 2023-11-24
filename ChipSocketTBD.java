public class ChipSocketTBD extends Tiles {

    //Constructor
    public ChipSocketTBD() {
        super(true, true);
    }

  //Constructor
  public ChipSocketTBD(boolean convertPath) {
    super(convertPath, true);
  }
  
  public void setWalkable(boolean walk) {
    super.setWalkable(walk && ComputerChip.isTrue());
  }
}
  

}