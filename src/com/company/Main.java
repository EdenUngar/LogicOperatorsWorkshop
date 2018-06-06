package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	    Relational Operators
	    <  - less than
	    <= -less than or equal to
	    >  - greater than
	    >= - greater than or equal to
	    == - equals
	    != - not equal to

	    Logical Operators
	    && - and
	    || - or
	    !  - not
	 */
	int a = 2;
	int b = 4;
	int x = 6;
	int y = 1;

	System.out.println("a = 2");
	System.out.println("b = 4");
	System.out.println("x = 6");
	System.out.println("y = 1");

	// && (and) operator
	if(a == x && y + y == a){
	    System.out.println("a == x && y + y == a");
	    //this method WILL NOT run because one of the conditions is not true, y + y does equal a, but a does not equal
		//x and the && needs both statements to be true
	}
	// || (or) operator
	if(a == x || y + y == a){
		System.out.println("a == x || y + y == a");
		//this WILL run because the or || only needs one to be true
    }
    // ! (not) operator
    if(a != x && y + y == a){
		System.out.println("a != x && y + y == a");
		//this WILL run bc by using the ! (not) operator, this AND will evaluate as true on both sides because a does not equal x
	}
//	// other examples
//	if(a + 7 != 8 && a + b != y){
//		System.out.println("a + 7 != 9 && a + b != y");
//	}
//	if(a > y || x < a) {
//		System.out.println("a > y || x < a");
//	}
	// Relational Operators
	// < (less than) operator
	if(a < b){
		System.out.println("a < b");
		//this WILL run because 2(a) is less than 4(b)
	}
	// <= (less than or equal to) operator
	if(a <= x){
		System.out.println("a <= x");
		//this WILL run because 2(a) is less than 6(x)
	}
	// > (greater than) operator
	if(b > a){
		System.out.println("b > a");
		//this WILL run because 4(b) is greater than 2(a)
	}
	// >= (greater than or equal to) operator
	if(y >= 1){
		System.out.println("y >= 1");
		//this WILL run because y(1) equals 1
	}
	// == (equal to) operator
	if(x == 6){
		System.out.println("x == 6");
		//this WILL run because x(6) equals 6
	}
	// != (not equal to) operator
	if(b != y){
		System.out.println("b != y");
		//this WILL run because b(4) does not equal y(1)
	}
}}
