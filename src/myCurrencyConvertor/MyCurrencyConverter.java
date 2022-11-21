package myCurrencyConvertor;

import java.util.Scanner;

public class MyCurrencyConverter {
public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	System.out.println("Choose one of the following option");
	System.out.println("1) USD TO NepaleseRupee");
	System.out.println("2) NepaleseRupee To USD");
	System.out.println("3 Pounds To USD");
	while(true) {
	 	int exchange = sr.nextInt();
	switch (exchange) {
	case 1:{
		System.out.println("Enter the amount of USD");
		 double usd = sr.nextDouble();
		 if (usd>0) {
			 System.out.println(usd+ "$ UDS is Rs. "+ usd*+130.90 + "NepaleseRupee");
			 }
			 else {
				 System.out.println("Please enter a valid number!!!");
				 }}
	break;
		 case 2:{
			 System.out.println("Enter the amount of NepaleseRupee");
			 double nrs= sr.nextDouble();
			 if (nrs>0) {
				 System.out.println(nrs+ "Rs. NepaleseRupee is $ "+ nrs*0.0076 +"USD");
			 }
			 else {
				 System.out.println("Please enter a valid number");
			 }
			 break;
		 }
		 case 3:{
			 System.out.println("Enter the amount of Pounds");
			 double pounds = sr.nextDouble();
			 if
				 (pounds>0){
				 System.out.println(pounds+  "Pounds is "+  pounds*1.28+"USD");
			 }
			 else {
				 System.out.println("Please enter a valid number");
			 }}
		 break;}
	
	 sr.close();
	
}}}
