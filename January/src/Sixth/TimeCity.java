package Sixth;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeCity {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 *nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
		 *next（）会自动消去有效字符前的空格，只返回输入的字符，不能得到带空格的字符串。
		*/
		
		System.out.println(sc.next());//next()遇到空格直接停止读取，交给nextLine()
		System.out.println(sc.nextLine());//nextLine遇到空格继续读取
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		//String str = sc.nextLine();
		Date date1 = df.parse(sc.nextLine());//sc用next()读取就不行，非得用nextLine()
		System.out.println(date1);

		//计算时区间隔时间
		Calendar cal=Calendar.getInstance();
		cal.setTime(date1);
		cal.add(cal.HOUR_OF_DAY, -7);
		System.out.println("转换为巴黎时间为"+cal.getTime().toString());
		cal.add(cal.HOUR_OF_DAY, -5);
		System.out.println("转换为纽约时间为"+cal.getTime().toString());
	}

}
