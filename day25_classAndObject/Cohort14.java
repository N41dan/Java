package day25_classAndObject;

import java.util.ArrayList;
import java.util.Arrays;

public class Cohort14 {
	public static void main(String[] args) {
		
		Student alex = new Student();
		alex.age = 18;
		alex.gender = 'M';
		alex.id = 1401;
		alex.name = "Alex";
		
		
		Student zakir = new Student();
		zakir.age = 18;
		zakir.gender = 'M';
		zakir.id = 1402;
		zakir.name = "Zakir";
		
		
		Student arezoo = new Student();
		arezoo.age = 18;
		arezoo.gender = 'F';
		arezoo.id = 1403;
		arezoo.name = "Arezoo";
		
		
		Student aytursun = new Student();
		aytursun.age = 18;
		aytursun.gender = 'F';
		aytursun.id = 1404;
		aytursun.name = "Aytursun";
		
		
		
//		
//		alex.study();
//		alex.code();
//		alex.submitHomework();
		
		ArrayList<Student> list = new ArrayList<>();
		
		
		list.add(arezoo);
		list.add(alex);
		list.addAll(Arrays.asList(aytursun,zakir));
		
		
		System.out.println(list.size());
		
		
		
//		for (int i = 0 ; i < list.size(); i++) {
//			list.get(i).getInfo();
//			list.get(i).study();
//			list.get(i).code();
//			list.get(i).submitHomework();
//			
//		}
//		
		
		
		
		
		
		for (int i = 0 ; i < list.size(); i++) {
			
			if (list.get(i).gender == 'M') {
			
			list.get(i).getInfo();
			list.get(i).study();
			list.get(i).code();
			list.get(i).submitHomework();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
