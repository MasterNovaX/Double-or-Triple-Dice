/* Name: Eshan Kiritharan
   Date: July 24, 2024
   Purpose of program:
   - Develop a user-friendly program that implements coding components (ex: variables, loops, arrays, and methods) learned through the ICS3UE course.
   - Create a probability game by simulating the roll of multiple dice at the user's discretion.
*/

// Import the Random class
import java.util.Random;
// Import the Scanner class.
import java.util.Scanner;

// Define the main class.
public class Main 
   {
      // Define the rules method.
      /* rules:

         This method recieves no parameters and returns no values. It displays the rules of the game to the user when called.

         Parameters: None
         Returns: Void
      */
      public static void rules()
      {
         // Print the rules of the game.
         System.out.println("");
         System.out.println("Select two or three dice to simulate the respective number of dice when playing.");
         System.out.println("");
         System.out.println("Your goal is to have the sum of the results of your dice match a winning number.");
         System.out.println("");
         System.out.println("If you have choose two dice, your winning numbers are 7, 9, 10 and 12. If you have chosen three dice, your winning numbers are 12, 13, 16, 17, and 18.");
         System.out.println("");
      }

      // Define the twoDice method.
      /* twoDice:

         This method recieves a constant integer and a String array, but returns no values. It simulates a probability game with two dice when called.

         Parameters: int, String []   
         Returns: Void
      */
      public static void twoDice(int ROUNDS, String [] results)
      {
         // Create a new scanner object for user inputs.
         Scanner scanner = new Scanner(System.in);

         // Declare and initialize the variables and array for the program.
         int diceA, diceB = 0;
         int [] winNumber = {7, 9, 10, 12};
         String input = "";
         Boolean win = false;

         // Instruct the user on the winning numbers of the game
         System.out.println ("");
         System.out.println ("Your winning numbers are 7, 9, 10 and 12.");

         // Create a for loop that iterates the number of rounds the user has selected.
         for (int i = 0; i < ROUNDS; i = i + 1)
         {
            // Prompt the user to enter [R] to simulate a dice roll.
            System.out.println ("");
            System.out.println ("Press the key [R] to roll the two dice.");
            System.out.println ("");

            // Store the input in the variable "input"
            input = scanner.nextLine();

            // Give the user a message depending on the input.
            if (input.equals("R") || input.equals("r"))
            {
               // Initialize the boolean "win" to false
               win = false;

               // Generate a random number between 1 and 6 for the first dice.
               diceA = (int)(Math.random() * 6) + 1;
               // Generate a random number between 1 and 6 for the second dice.
               diceB = (int)(Math.random() * 6) + 1;

               // Print the results of the dice roll.
               System.out.println ("");
               System.out.println ("You rolled a " + diceA + " and a " + diceB + ", adding up to " + (diceA + diceB) + ".");
               System.out.println ("");

               // Create a for loop that iterates through the winning numbers array.
               for (int j = 0; j < winNumber.length; j = j + 1)
               {
                  if ((diceA + diceB) == winNumber[j])
                  {
                     // Output a winning message to the user.
                     System.out.println ("You won the round!");
                     // Input an element in the array cell results[i]
                     results[i] = "Round " + (i + 1) + ": Won";
                     // Set the boolean "win" to true
                     win = true;
                     // Break from the for loop
                     break;
                  }
               }
               if (!win)
               {
                  // Give a losing message if the user does not win the round.
                  System.out.println ("You did not win the round.");

                  // Input an element in the array cell results[i]
                  results[i] = "Round " + (i + 1) + ": Lost";
               }
            }
            else
            {
               // Output a losing message to the user for entering the wrong input.
               System.out.println("");
               System.out.println ("You did not press the key [R]. You automatically lose the round.");
               // Input an element in the array cell results[i]
               results[i] = "Round " + (i + 1) + ": Lost";
            }
         }
      }

      // Define the threeDice method.
      /* threeDice:

         This method recieves a constant integer and a String array, but returns no values. It simulates a probability game with three dice when called.

         Parameters: int, String []   
         Returns: Void
      */
      public static void threeDice(int ROUNDS, String [] results)
      {
         // Create a new scanner object for user inputs.
         Scanner scanner = new Scanner(System.in);

         // Declare and initialize the variables and array for the program.
         int diceA, diceB, diceC = 0;
         int [] winNumber = {12, 13, 16, 17, 18};
         String input = "";
         Boolean win = false;

         // Instruct the user on the winning numbers of the game
         System.out.println ("");
         System.out.println ("Your winning numbers are 12, 13, 16, 17 and 18.");

         // Create a for loop that iterates the number of rounds the user has selected.
         for (int i = 0; i < ROUNDS; i = i + 1)
         {
            // Prompt the user to enter [R] to simulate a dice roll.
            System.out.println ("");
            System.out.println ("Press the key [R] to roll the three dice.");
            System.out.println ("");

            // Store the input in the variable "input"
            input = scanner.nextLine();

            // Give the user a message depending on the input.
            if (input.equals("R") || input.equals("r"))
            {
               // Initialize the boolean "win" to false
               win = false;

               // Generate a random integer between 1 and 6 for the first, second and third dice.
               diceA = (int)(Math.random() * 6) + 1;
               diceB = (int)(Math.random() * 6) + 1;
               diceC = (int)(Math.random() * 6) + 1;

               // Print the results of the dice roll.
               System.out.println ("");
               System.out.println ("You rolled a " + diceA + ", a " + diceB + " and a " + diceC + ", adding up to " + (diceA + diceB + diceC) + ".");
               System.out.println ("");

               // Create a for loop that iterates through the winning numbers array.
               for (int j = 0; j < winNumber.length; j = j + 1)
               {
                  if ((diceA + diceB + diceC) == winNumber[j])
                  {
                     // Output a winning message to the user.
                     System.out.println ("You won the round!");
                     // Input an element in the array cell results[i]
                     results[i] = "Round " + (i + 1) + ": Won";
                     // Set the boolean "win" to true
                     win = true;
                     // Break from the for loop
                     break;
                  }
               }
               if (!win)
               {
                  // Give a losing message if the user does not win the round.
                  System.out.println ("You did not win this round.");

                  // Input an element in the array cell results[i]
                  results[i] = "Round " + (i + 1) + ": Lost";
               }

            }
            else
            {
               // Output a losing message to the user for entering the wrong input.
               System.out.println("");
               System.out.println ("You did not press the key [R]. You automatically lose the round.");
               // Input an element in the array cell results[i]
               results[i] = "Round " + (i + 1) + ": Lost";
            }
         }
      }

      // Define the display method.
      /* display:

         This method recieves a String array and a Boolean variable and returns a Boolean value. It displays the results of the game to the user when called.

         Parameters: String [], Boolean
         Returns: Boolean
      */
      public static Boolean display(String [] results, Boolean exit)
      {
         // Create a new scanner object for user inputs.
         Scanner scanner = new Scanner(System.in); 
         
         // Declare variables for the method
         Boolean valid = false;
         String input = "";

         // Output a subheader for the results of the game
         System.out.println ("");
         System.out.println ("Your results for the game:");
         System.out.println ("");
         
         // Declare a for loop outputting the user's results 
         for (int i = 0; i < results.length; i = i + 1)
         {
            System.out.println(results[i]); 
         }

         // Create a do while loop that iterates until the user enters a valid input.
         do
         {
            // Prompt the user to play again or exit the program.
            System.out.println("");
            System.out.println("Would you like to play again or exit the program?");
            System.out.println("");
            System.out.println("Enter [P] to play again or [X] to exit.");
            System.out.println("");

            // Store the input in the variable "input"
            input = scanner.nextLine();

            // Give the user a message depending on the input.
            if (input.equals("P") || input.equals("p"))
            {
               // Output a welcome back message to the user.
               System.out.println("");
               System.out.println("You have chosen to play again. Welcome back!");
               System.out.println("");
               
               // Set the boolean "valid" to true to exit the loop.
               valid = true;
               // Set the boolean "exit" to false to repeat the program.
               exit = false;
            }
            else if (input.equals("X") || input.equals("x"))
            {
               // Output a farewell message to the user.
               System.out.println("");
               System.out.println("You have chosen to exit the program. Goodbye!");
               System.out.println("");

               // Set the boolean "valid" to true to exit the loop.
               valid = true;
               // Set the boolean "exit" to true to exit the program.
               exit = true;
            }
            else
            {
               // Output a message to the user for entering an invalid input.
               System.out.println("");
               System.out.println("Invalid input. Please try again.");

               // Set the boolean "valid" to false to repeat the prompt.
               valid = false;
            }      
         } while (!valid);
         
         // Return the value of the boolean "exit".
         return (exit);
      }
      
      // Define the main method.
      public static void main(String[] args)
      {
         // Create a Scanner object for user inputs.
          Scanner scanner = new Scanner(System.in);

          // Declare and initialize variables, an array and a constant for the program.
         String input = "";
         int num = 0;
         Boolean exit = true;
         Boolean valid = true;
         String [ ] results = new String [5];
         final int ROUNDS = 5;

         // Give a welcome message to the user
         System.out.println("");
         System.out.println("Welcome to Double or Triple Dice!");
         System.out.println("");
         System.out.println("This game will simulate the roll of two or three dice at your discretion.");
         System.out.println("");

         // Declare a while loop repeating until the user chooses to exit the program.
         do
         {
            // Declare a while loop repeating until the user enters a valid input.
            do
            {
               // Prompt the user to play the game immediately or view the rules
               System.out.println("Press [P] to play the game or [R] to view the rules.");
               System.out.println("");
               input = scanner.nextLine();

               // Give different outputs based on the user's input

               if (input.equals("P")||input.equals("p"))
               {
                  // Prompt the user to enter the number of dice they want to roll.
                  System.out.println("");
                  System.out.println("Enter the number of dice you want to roll (2 or 3):");
                  System.out.println("");
                  
                  // Declare a while loop repeating until the user enters a valid input.
                  do
                  {
                     // Store the user's input in the string "input"
                     input = scanner.nextLine();

                     // Try to parse the user's input as an integer.
                     try
                     {
                        num = Integer.parseInt(input);
                     }
                     // Catch any exceptions and give an error message.
                     catch (NumberFormatException e)
                     {
                        System.out.println("");
                        System.out.println("Your input is not an integer. Please try again.");
                        valid = false;
                     }

                     // Give different outputs depending on the integer inputted/
                     switch (num)
                        {
                           case 2:
                              // Call the "twoDice" method
                              // Set the boolean variable "valid" to true to exit the loop.
                              valid = true;
                              twoDice(ROUNDS, results);
                              break;
                           case 3:
                              // Call the "threeDice" method
                              // Set the boolean variable "valid" to true to exit the loop.
                              valid = true;
                              threeDice(ROUNDS, results);
                              break;
                           default:
                              // Give an error message if the user enters an invalid integer
                              System.out.println("");
                              System.out.println("Please enter the number 2 or 3.");
                              System.out.println("");
                              
                              // Set the boolean variable "valid" to false to continue the loop.
                              valid = false;
                        }
                     
                  } while (!valid);
               }
               else if (input.equals("R")||input.equals("r"))
               {
                  // Call the "rules" method to display the rules of the game
                  rules();
                  // Set the boolean "valid" to false to repeat the loop
                  valid = false;
               }
               else
               {
                  // Output an error message to the user.
                  System.out.println("");
                  System.out.println("Invalid input. Please try again");
                  System.out.println("");
                  // Set the boolean variable "valid" to false to continue the loop.
                  valid = false;
               }
            } while (!valid);

            // Call the "display" method to display the results to the user

            exit = display(results, exit);
            
         } while (!exit);
         
      }
   }
