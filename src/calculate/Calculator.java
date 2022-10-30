package calculate;

/*
Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”, and “multiplication”.
 All methods are instance method and it doesn’t return anything. But it has two parameters with name “int a” and “int b”.
  Also each method have System.out.println(). This prints the result.
   Also create all one more method with name “calculateResult” with three parameter with name int a, int b and char symbol.
  Write the logic in calculateResult method that when user enter first number and second number and symbol based on symbol it does calculate.
4. Write a “main” method into main class. It has scanner that takes user input. Also write the logic that it ask user to “Enter first Number:”,
 “Enter second Number:” “Please enter one of symbol +,-,*, /:”
if user enter + symbol result like “Addition of 5 and 10 is: 15” and respective for other symbol.
5. With the result it’s also print one more message “Would you like to do more calculation Please enter “Y” or “N” :”
(Hint use while loop if user enter Y program asking the user to enter First Number, and if user enter
 */
public class Calculator {
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition of " + a + " and " + b + " is : " + result);
    }

    public void subtration(int a, int b) {
        int result1 = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is : " + result1);
    }

    public void divison(int a, int b) {
        int result2 = a / b;
        System.out.println("Divison of " + a + " and " + b + " is : " + result2);


    }

    public void multiplication(int a, int b) {
        int result3 = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is : " + result3);

    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            int result = a + b;
            System.out.println("Addition of " + a + " and " + b + " is : " + result);

        } else if (symbol == '-') {
            int result1 = a - b;
            System.out.println("Subtraction of " + a + " and " + b + " is : " + result1);
        } else if (symbol == '*') {
            int result3 = a * b;
            System.out.println("Multiplication of " + a + " and " + b + " is : " + result3);

        } else if (symbol == '/') {
            int result2 = a / b;
            System.out.println("Divison of " + a + " and " + b + " is : " + result2);
        } else {
            System.out.println("Symbol is incorrect");


        }


    }
}
