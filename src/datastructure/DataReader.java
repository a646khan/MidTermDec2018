package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = "/Users/maruf/AllJavaProject/MidTermDec2018/src/data/self-driving-car";
		FileReader fr = null;
		try{
			fr = new FileReader(textFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ConnectToSqlDB connect = new ConnectToSqlDB();
		BufferedReader bf = new BufferedReader(fr);
		String text;

		Stack stack = new Stack();
		LinkedList<String> linkedList = new LinkedList<>();
		int count =0;

		connect.createTableFromStringToMySql("SelfDrivingCar","text");
		try {
			while ((text = bf.readLine()) != null) {
				System.out.println(text);
				String[] words = text.split(" ");
				for(int i =0; i<words.length; i++){       //loop to read
					stack.push(words[i]);

					//System.out.println("Stack "+stack.peek());
					linkedList.add(words[i]);
					//System.out.println("LinkedList "+linkedList.get(i));
				}


				connect.insertDataFromStringToSqlTable(text, "SelfDrivingCar", "text");
			}
			System.out.println("Total word count: "+count);

		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				bf.close();
				fr.close();

			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}




	}

}
