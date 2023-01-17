
class Exercise16 {

  public static void main(String[] args) {

    // arr to count number of each player getting shot
    int[] players = { 0, 0, 0, 0, 0, 0 };

    // simulate this gun shooting game one thousand rounds
    for (int i = 0; i < 1000; i++) {

      // five bullets are put into a gun's barrel
      boolean[] bullet = { false, true, true, true, true, true };

      // firing the gun
      for (int j = 0; j < 6; j++) {
        // roll the barrel before each shooting
        int roll =  (int)(Math.random() * 6);

        // player gets shot and die
        if (bullet[roll]) {
          players[j] += 1;
          bullet[roll] = false;
        }
        // record
        // System.out.print(roll + ": ");
        // System.out.print(Arrays.toString(bullet) + ": ");
        // System.out.println(Arrays.toString(players));
      }
      // System.out.println("================================================");
    }
    for(int i = 0; i < players.length; i++){
      System.out.println((i+1) + ". player "+ (i+1) +" getting shot " + players[i] + " times");
    }
  }
}
