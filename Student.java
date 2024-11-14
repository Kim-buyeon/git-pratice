package weekFour;

import java.util.Scanner;

public class Student {
	Team myTeam;
	int id;
	String name;
	int year;
	String phone;
	Student(String id){
		this.id = Integer.parseInt(id); 
	}
	void read(Scanner scanner) {
		name = scanner.next();
		year = scanner.nextInt();
		phone = scanner.next();
	}
	void setTeam(Team t) {
		myTeam = t;
	}
	void print() {
		System.out.printf("%d %s (%d학년) %s\n",id,name,year,phone);
	}
	void printName() {
		System.out.print(name+" ");
	}
	boolean matchesId(int n) {
		return id == n;
	}

}
