package ProblemOne;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class test {
	public static void main(String[] args){
		
	  int startingValue=10;
	  int terminatingValue=5;
	  int stepValue=1;

	for ( int i = startingValue; i <= terminatingValue; i += stepValue ){
		switch( i ){
	  		case 0:
	  			System.out.print( "Hello there, " );
	  			break;
	  		case 1:
	  			System.out.println( "What’s up? " );
	  			break;
	  		case 2:
		  		System.out.println( "How are you doing? " );
		  		break;
		  	case 3:
		  		System.out.println( "Terrific. " );
		  		break;
		  	case 4:
		  		System.out.println( "Beautiful day isn't it? " );
		  		break;
		  	case 5:
		  		System.out.println( "Yes it is. " );
		  		break;
		  	default:
		  		System.out.println( "See you later. " );
		} // end switch
	} // end for
	for ( int i = 0; i <= 11; i++ ){
		if ( i % 2 == 0 )
			continue;
		if ( i == 11 )
			break;
		System.out.printf( "%d ", i );
	} // end for
	System.out.printf("\n");
	String names[] = {"mary","jane","frank","eric"};
	removeElements(names,"jane");
	for(String moreNames:names){
		System.out.println(moreNames);
	}
	int product = 1;
	for ( int i = 1; i <= 5; i++ ){
		product *= i;
		System.out.printf( "%d ", product );
	}
	System.out.println();
	
	String alpha = "zebra in Africa";
	String anti = reverseAlphabet(alpha);
	System.out.println(anti);
	
	int threeDArray[][][] = {{{10},{20},{30}},{{40},{50},{60}},{{70},{80},{90}}};
	for(int x[][]:threeDArray){
		for(int y[]:x){
			for(int z:y){
				if(((z-10)%30)==0)
					System.out.println();
				System.out.printf("%d ",z);
			}
		}
	}
	
	System.out.println();
	
	
	System.out.println();

	
	//printing out the 3d array by hand
	System.out.printf("\n\n%d %d %d\n%d %d %d\n%d %d %d\n",threeDArray[0][0][0]
			,threeDArray[0][1][0],threeDArray[0][2][0],threeDArray[1][0][0]
			,threeDArray[1][1][0],threeDArray[1][2][0],threeDArray[2][0][0]
			,threeDArray[2][1][0],threeDArray[2][2][0]);
	
	int something = 9;
	
}
	
public static String reverseAlphabet(String name){
	
	//convert string to char array
	char myCharArray[] = name.toCharArray();

	//reverse alphabetical order for char array
	char temp;
	for(int i=myCharArray.length-1;i>0;i--){
		for(int j=0;j<i;j++){
			if(Character.getNumericValue(myCharArray[j])<Character.getNumericValue(myCharArray[j+1])){
				temp=myCharArray[j];
				myCharArray[j]=myCharArray[j+1];
				myCharArray[j+1]=temp;
			}
		}
	}
	//convert char array back to string
	//String myStr = String.valueOf(myCharArray);
	String myStr = new String(myCharArray);
	
	return myStr;
}
public static String[] removeElements(String[] input, String deleteMe) {
	LinkedList<String> result = new LinkedList<String>();

	
	result.remove(deleteMe);
	return (String[]) result.toArray(input);
}
/*
	1) What will be the output if the following code is placed at line 4 of the preceding class definition?
	  startingValue = 0;
	  terminatingValue = 6;
	  stepValue = 2;



	2) What will be the output if the following code is placed at line 4 of the preceding code?

	1 startingValue = 0;
	2 terminatingValue = 6;
	3 stepValue = 3;



	3) What will be the output if the following code is placed at line 4 of the preceding code?
	1 startingValue = -3;
	2 terminatingValue = 2;
	3 stepValue = 1;

	4) What will be the output if the following code is placed at line 4 of the preceding code?

	1 startingValue = -5;
	2 terminatingValue = 1;
	3 stepValue = 2;

	5) What will be the output if the following code is placed at line 4 of the preceding code?

	1 startingValue = 10;
	2 terminatingValue = 5;
	3 stepValue = 1;


	6) What is output by the following code segment?

	1 for ( int i = 0; i <= 11; i++ )
	2 {
	3 if ( i % 2 == 0 )
	4 continue;
	5

	6if ( i == 11 )
	7 break;
	89
	System.out.printf( "%d ", i );
	10 } // end for

	 

	 7) The following for loop should calculate the product of the integers in the range 1–5.

	for ( int i = 1; i <= 5; i++ )
	2 {
	3 int product = 1;
	4 product *= i;
	5 }


	8) Consider the following code snippet.
	if (aNumber >= 0)
	    if (aNumber == 0)
	        System.out.println("first string");
	else System.out.println("second string");
	System.out.println("third string");
	a. What output do you think the code will produce if aNumber is 3?




	9) int threeDArray [][][] = {{{10},{20},{30}},
	                             {{40},{50},{60}},
	                      {{70},{80},{90}}};

	Given an array of integers as above follows can you print output of 3 dimensional arrays as follows :

	10 20 30
	40 50 60
	70 80 90*/
}
