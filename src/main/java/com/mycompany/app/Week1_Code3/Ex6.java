package com.mycompany.app.Week1_Code3;

public class Ex6 {
	static int result = 0;
	static void checkVoid(int testval, int begin, int end) {
		if((testval > begin) && (testval < end))
		result = +1;
		else if((testval == begin) || (testval == end))
		result = 0;
		else
		result = -1; 
		}
	static int checkReturn(int testval, int begin, int end) {
		if((testval > begin) && (testval < end))
		return +1;
		else if((testval == begin) || (testval == end))
		return 0;
		else
		return -1;
		}
}