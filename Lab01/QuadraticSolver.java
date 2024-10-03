/*
 * QuadraticSolver.java  	1.1 26/08/2011
 *
 * Copyright (c) University of Sheffield 2011
 */

import sheffield.EasyReader;

/**
* QuadraticSolver.java
* solves quadratic equations for x given a*x*x + b*x + c = 0
* the code should be modified so that a, b, and c are input by the user
*
* @version 1.1 26 August 2011
*
* @author Mark Stevenson (mark.stevenson@sheffield.ac.uk)
* @author (based on code written by Richard Clayton)
*/
public class QuadraticSolver {
    public static void main( String[] arg) {
			EasyReader keyboard = new EasyReader();
			double a = keyboard.readDouble("Input a value for a: ");
			double b = keyboard.readDouble("Input a value for b: ");
			double c = keyboard.readDouble("Input a value for c: ");

			// default values for coefficients a, b, and c
			// initially, these are stored as both integers and float
			// int aInt = 1, bInt = 2000000, cInt = 1;
			// double aFloat = 1, bFloat = 2000000, cFloat = 1;

			// declare variables to store the two values of x that satisfy the equation
			double x1, x2;

			// work out the solution with int types
			// x1 = (-1 * bInt + Math.sqrt(bInt*bInt - 4 * aInt * cInt)) / (2 * aInt);
			// x2 = (-1 * bInt - Math.sqrt(bInt*bInt - 4 * aInt * cInt)) / (2 * aInt);
			// System.out.println("Solution with integer types is x1 = " + x1 + ", and x2 = " + x2);

			// work out the solution with double types
			x1 = (-1.0 * b + Math.sqrt(b*b - 4.0 * a * c)) / (2.0 * a);
			x2 = (-1.0 * b - Math.sqrt(b*b - 4.0 * a * c)) / (2.0 * a);
			System.out.println("Solution with double types is  x1 = " + x1 + ", and x2 = " + x2);
			double sol1 = a* Math.pow(x1,2.0)+b*x1+ c;
			double sol2 = a* Math.pow(x2,2.0)+b*x2 + c;

			System.out.printf("%.5f\n",sol1);
			System.out.printf("%.5f\n",sol2);


    }
}
