package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	    Relational Operators
	    < - less than
	    <= -less than or equal to
	    > - greater than
	    >= - greater than or equal to
	    == - equals
	    != - not equal to

	    Logical Operators
	    && - and
	    || - or
	    ! - not
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
	    //this method will not run because one of the conditions is not true, y + y does equal a, but a does not equal
		//x and the && needs both statements to be true
	}
	// || (or) operator
	if(a == x || y + y == a){
		System.out.println("a == x || y + y == a");
		//this will work because the or || only needs one to be true
    }
    // ! (not) operator
    if(a != x && y + y == a){
		System.out.println("a != x && y + y == a");
		//this will run bc by using the ! (not) operator, this AND will evaluate as true on both sides because a does not equal x
	}
}}
