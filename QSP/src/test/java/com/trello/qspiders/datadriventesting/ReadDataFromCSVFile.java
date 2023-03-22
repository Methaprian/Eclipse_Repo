package com.trello.qspiders.datadriventesting;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadDataFromCSVFile {

	public static void main(String[] args) throws Throwable {
		Reader reader = new FileReader("./src/test/resources/csvtestcasedata.csv");
		CSVReader csvDataRead = new CSVReader(reader);
		List<String[]> allCsvData = csvDataRead.readAll();
		for (String[] csvStringArray : allCsvData) {
				System.out.println(csvStringArray);
			for (String data : csvStringArray) {
				System.out.println(data);
			}
		}
	}

}
