package math.problems;

import databases.ConnectToSqlDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */

		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};	int[] initializedArray

				= new int[] { 25, 110, 74, 75, 5 };



		System.out.println("Given array ");



		for (int i = 0; i < initializedArray.length; i++) {



			System.out.println(initializedArray[i]);

		}

		int minValue = initializedArray[0];


		for (int i = 0; i < initializedArray.length; i++) {
			if (initializedArray[i] < minValue)



				minValue = initializedArray[i];

		}



		System.out.println(

				"Smallest element present in given array: "

						+ minValue);

	}

}

