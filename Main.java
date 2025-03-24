/********************************************
*	AUTHORS:	Skylar Hollingsworth,
* COLLABORATORS: None
*	LAST MODIFIED:	3/22/2025
********************************************/

/********************************************
*	<Housing Affordability Calculator>
* https://calmatters.org/explainers/california-housing-costs-explainer/
*********************************************
*	PROGRAM DESCRIPTION:
*	<Assists you in determining if the house/apartment you would like to buy/rent is affordable for you>
*********************************************
*	ALGORITHM:
*	<>
*********************************************
*	STATIC METHODS:
* <artHouse, calcIntroduction, availableIncome, rentAffordable - Skylar>
*********************************************/


public class Main 
{
/***** CONSTANT SECTION *****/
  final static String PROJECT_NAME = "Housing Affordability Calculator";

  //Fictional Person's Data
  static int incomeAshley = 5000;
  static int rentAshley = 1500;
  static int expensesAshley = 2500;

    public static void main(String[] args)
{
/***** DECLARATION SECTION *****/
    
/***** INITIALIZATION SECTION *****/

/***** INTRO SECTION *****/

/***** PROCESSING SECTION *****/

/***** OUTPUT SECTION *****/
    Main.calcIntroduction(PROJECT_NAME);
    Main.availableIncome (incomeAshley, expensesAshley);
    Main.rentAffordable(rentAshley, incomeAshley);

}

/***** STATIC METHODS *****/
  //DESCRIPTION: Determines the income available for rent after deducting personal expenses
  //PRECONDITIONS: numbers in terms of money
  //POSTCONDITIONS: helpful information about budgeting
  public static void availableIncome (int incomeActual, int expensesActual)
  {
    System.out.println("Let's figure out how much of your budget is available for your housing expenses!");
    System.out.printf("What is your monthly income? : $%,d.%n", incomeActual);
    System.out.printf("What are your monthly expenses? : $%,d.%n", expensesActual);
    System.out.printf("You will have $%,.2f available for housing expenses.%n%n", (incomeActual - (double) expensesActual));
  }

  //DESCRIPTION: Determines if rent is affordable for personal income/budget
  //PRECONDITIONS: numbers in terms of money
  //POSTCONDITIONS: helpful information about budgeting your rent
  public static void rentAffordable (int rentActual, int incomeActual)
  {
    System.out.println("Next, let's determine if the home you want to rent is afforable for you!");
    System.out.println("Your rent is considered affordable if it comprises 30% or less of your income.");
    System.out.println("Let's see if that is the case for you.");
    System.out.printf("What is the monthly rent of the home you want to check? : $%,d %n", rentActual);
    System.out.printf("Your rent will comprise %.2f%% of your monthly income.%n%n", (rentActual / (double) incomeActual * 100));
  }

  //DESCRIPTION: Introducing calculator
  //PRECONDITIONS: name of the project
  //POSTCONDITIONS: introduces what the calculator is and does
  public static void calcIntroduction(String projectName)
    {
      System.out.println("------------------------------------");
      Extra.artHouse();
      System.out.println("------------------------------------\n");
      System.out.println("~ Welcome ~");
      System.out.println("This is the " + projectName + "!");
      System.out.println("With this calculator you can check the afforability of your home.\n");
    }

}