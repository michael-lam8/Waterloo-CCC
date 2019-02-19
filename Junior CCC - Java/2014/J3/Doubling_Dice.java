import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.nextLine();
    int player1 = 100;
    int player2 = 100;
    for (int i = 0; i < number; i++) {
      String numbers = scanner.nextLine();
      int[] subtract = calculatePoints(numbers, player1, player2);
      player1 -= subtract[0];
      player2 -= subtract[1];
    }
    System.out.println(player1);
    System.out.println(player2);
    scanner.close();
  }

  public static int[] calculatePoints(String numbers, int player1, int player2) {
    String[] numbersArray = numbers.split(" ");
    int first = Integer.valueOf(numbersArray[0]) ;
    int second = Integer.valueOf(numbersArray[1]);

    if (first > second) {
       int[] returnArray = {0, first};
       return returnArray;
    } else if (second > first) {
       int[] returnArray1 = {second, 0};
       return returnArray1;
    }
    int[] array = {0,0};
      return array;


  }
}
