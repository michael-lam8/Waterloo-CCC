import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.nextLine();
    int count = 0;
    
    for(int j = 0; j < number; j++){
      for(int i = 0; i < number; i++){
        count++;
        System.out.print("*");
      }
     for(int i = 0; i < number; i++){
        System.out.print("x");
      }
      for(int b = 0; b < number; b++){
        System.out.print("*");
      }
      System.out.println("");
    }

    for(int j = 0; j < number; j++){
      for(int i = 0; i < number; i++){
        count++;
        System.out.print(" ");
      }
     for(int i = 0; i < number; i++){
        System.out.print("x");
      }
      for(int b = 0; b < number; b++){
        System.out.print("x");
      }
      System.out.println("");
    }

    for(int j = 0; j < number; j++){
      for(int i = 0; i < number; i++){
        count++;
        System.out.print("*");
      }
     for(int i = 0; i < number; i++){
        System.out.print(" ");
      }
      for(int b = 0; b < number; b++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
