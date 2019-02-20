import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.nextLine();
    String word = scanner.nextLine();
    char[] letters = word.toUpperCase().toCharArray();
    
    char[] newCharacters = new char[letters.length];
    for (int i = 0; i < letters.length; i++) {
      newCharacters[i] = getNewCharacter(letters[i], number, i + 1);
           System.out.print(newCharacters[i]);
    }
    
  }

  // 3 * i + number

  public static char getNewCharacter(char character, int k, int index) {
    int ascii = (int) character;  
    ascii -= 3 * index + k;
    if (ascii < 65) { ascii += 26;}
    
    char newCharacter = (char)ascii;
    return newCharacter; 
  }
}