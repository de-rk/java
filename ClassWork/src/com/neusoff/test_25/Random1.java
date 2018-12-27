package com.neusoff.test_25;
import java.util.Random;
public class Random1 {
	public static void main(String[] args) {
		Random random=new Random();
		for (int i=0;i<101;i++)
		new A(random.nextInt(101));
	}
}
