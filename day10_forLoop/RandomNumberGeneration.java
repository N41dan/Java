package day10_forLoop;

import java.util.Random;

public class RandomNumberGeneration {
	public static void main(String[] args) {
		
		Random num = new Random();
		
		int secretNum = num.nextInt(5);
		
		System.out.println(secretNum);
		
		
		
	}
}
