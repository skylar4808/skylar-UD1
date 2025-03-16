/********************************************
*	AUTHORS:	Skylar Hollingsworth,
* COLLABORATORS: 
*	LAST MODIFIED:	3/13/2025 by Skylar
********************************************/

/********************************************
*	<Housing Affordability Calculator>
* https://calmatters.org/explainers/california-housing-costs-explainer/
*********************************************
*	PROGRAM DESCRIPTION:
*	<Assists you in determining if the house/apartment you would like to buy/rent is affordable for you>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <artHouse, calcIntroduction, availableIncome, rentAffordable - Skylar>
*********************************************/


public class Main 
{
/***** CONSTANT SECTION *****/
  final static String PROJECT_NAME = "Housing Affordability Calculator";
  //Fictional Person's Data:
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
  //PRECONDITIONS:
  //POSTCONDITIONS:
  public static void availableIncome (int incomeActual, int expensesActual)
  {
    System.out.printf("Your current monthly income is: $%,d.%n", incomeActual);
    System.out.printf("Your monthly expenses are: $%,d.%n", expensesActual);
    System.out.printf("You have $%,d available for rent expenses.%n%n", (incomeActual - expensesActual));
  }

  //DESCRIPTION: Determines if rent is affordable for personal income/budget
  //PRECONDITIONS:
  //POSTCONDITIONS:
  public static void rentAffordable (int rentActual, int incomeActual)
  {
    System.out.println("Is the home you want to rent afforable for your monthly budget?");
    System.out.println("Your rent is considered affordable if it comprises 30% or less of your income.");
    System.out.printf("If the home you rent costs $%,d per month.%n", rentActual);
    System.out.printf("Then your rent would comprise %.2f%% of your income.%n%n", (rentActual / (double) incomeActual * 100));
  }

  //DESCRIPTION: Introducing calculator
  //PRECONDITIONS:
  //POSTCONDITIONS:
  public static void calcIntroduction(String projectName)
    {
      System.out.println("------------------------------------");
      Extra.artHouse();
      System.out.println("------------------------------------\n");
      System.out.println("Hi, everyone!");
      System.out.println("This is the " + projectName + "!");
      System.out.println("With this calculator you will be able to check the afforability of the home you would like to rent!\n");
    }

}