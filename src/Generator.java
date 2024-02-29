import java.util.Objects;
import java.util.Scanner;

public class Generator{
  Alphabet alphabet;

  public static Scanner keyboard;

  public Generator(Scanner scanner){
    keyboard = scanner;
  }

  public Generator(boolean IncludeUpper, boolean IncludeLower, boolean IncludeNum, boolean IncludeSym) {
    alphabet = new Alphabet(IncludeUpper, IncludeLower, IncludeNum, IncludeSym);
  }

  public void mainLoop(){
    System.out.println("Welcome to Password Services :)");
    printMenu();

    String userOption = "-1";
    while(!userOption.equals("4")){
      userOption = keyboard.next();

      switch (userOption){
        case "1" -> {
          requestPassword();
          printMenu();
        }
        case "2" ->{}
        checkPassword();
        printMenu();
      }
      case "3" -> {
        printUsefulInfo();
        printMenu();
      }
      case "4" -> printQuitMessage();
      default -> {
        System.out.println();
        System.out.println("Kindly select one of the available commands");
        printMenu();
      }
    }
  }
}

