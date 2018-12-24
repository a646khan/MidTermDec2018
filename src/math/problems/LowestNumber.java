package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) throws Exception {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.

		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};*/
		System.out.println("lowest number from array is :"+LowestNumber.lowestNumber());

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(LowestNumber.lowestNumber());



		List list =  arrList;

		//Connect to MySql Database
		ConnectToSqlDB connectDB = new ConnectToSqlDB();

		//Create table in the database
		connectDB.insertDataFromArrayListToSqlTable(list,"lowestNumber","number");


		//Read data from database
		List<String> numbers = connectDB.readDataBase("lowestNumber", "number");
		for(String st:numbers){
			System.out.println(st);
		}
	}

	public static int lowestNumber(){

		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		int lowest = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (lowest > array[i]) {
				lowest = array[i];
			}
		}

		return lowest;
	}


}
