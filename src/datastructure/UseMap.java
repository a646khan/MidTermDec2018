package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		// Use of HashMapList
		List<String> cityOfUSA = new ArrayList<>();
		cityOfUSA.add("NY");
		cityOfUSA.add("NJ");
		cityOfUSA.add("CA");

		ConnectToSqlDB connect = new ConnectToSqlDB();

		List listCU = cityOfUSA;
		connect.insertDataFromArrayListToSqlTable(listCU,"cityOfUSA","City");
		System.out.println("Data showing from database:");
		List<String> numberu = connect.readDataBase("cityOfUSA","City");
		for(String st:numberu){
			System.out.println(st);
		}

		List<String> cityOfCanada = new ArrayList<>();
		cityOfCanada.add("Toronto");
		cityOfCanada.add("Montreal");
		cityOfCanada.add("Ottowa");

		List listCC = cityOfCanada;
		connect.insertDataFromArrayListToSqlTable(listCC,"cityOfCANDA","City");
		System.out.println("Data showing from database:");
		List<String> numberc = connect.readDataBase("cityOfCANDA","City");
		for(String st:numberc){
			System.out.println(st);
		}

		List<String> cityOfUK = new ArrayList<>();
		cityOfUK.add("London");
		cityOfUK.add("Manchester");
		cityOfUK.add("Scotland");

		List listCUK = cityOfUK;
		connect.insertDataFromArrayListToSqlTable(listCUK,"cityOfUK","City");
		System.out.println("Data showing from database:");
		List<String> numberk = connect.readDataBase("cityOfUK","City");
		for(String st:numberk){
			System.out.println(st);
		}

		Map<String, List<String>> list = new LinkedHashMap<>();
		list.put("USA", cityOfUSA);
		list.put("Canada", cityOfCanada);
		list.put("UK", cityOfUK);
		System.out.println("View from HashMap");
		for (Map.Entry entry:list.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}




	}

}
