package commandlineArguements;

public class Commandline {

	public static void main(String[] args) {  //here i have created  the main method 
		// to give command line arguments in Eclipse right click on the blank space->go to run as ->run configuration->

				//then in the program arguments section provide arguments separated by space.
							Integer firstNumber=new Integer(args[0]);
							//here it takes the value which we passed in the index arguments 
							Integer secondNumber=Integer.parseInt(args[3]); 
							//here in two ways we can  read integer value
							System.out.println("given arguments are :11 37 21 12 ");

							System.out.println("the output is :");

							System.out.println(firstNumber+" "+secondNumber);// here  it prints the values of index of size zero and of index size three

							System.out.println( firstNumber + secondNumber );// here it adds the two values of the given arguments

							
					   		   // Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber)

					   		   // = Integer.parseInt("11") + Integer.parseInt("12")

					   		   // = 11 + 12 = 23

					   		   // Because + = ADD when used on integers

						} // otherwise  a  "11" + "12" = "1112" 

			   // Because + = concatenate when used on strings





					}

