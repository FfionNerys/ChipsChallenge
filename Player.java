public class Player {

    private int id;
    private String word;
    private int howMany;
    private char firstChar;

    public Player (int i, String w, int h, char f){
        id = i;
        word = w;
        howMany = h;
        firstChar = f;
    }
      public int getId(){
        return id;
      }
        public String getWord(){
          return word;
      }
        public int getHowMany(){
          return howMany;
      }
        public char getFirstChar(){
          return firstChar;
  }
}