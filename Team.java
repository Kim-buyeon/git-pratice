package weekFour;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {
	ArrayList<Student>members = new ArrayList<>();
	String teamName;
	Team(String name){
		teamName = name;
	}
	void read(Scanner scanner,Deparement dept) {
		int id=0;
		while(true) {
			Student std = null;
			id = scanner.nextInt();
			if(id == 0)break;
			std = dept.findStudent(id);
			std.setTeam(this);
			members.add(std);
		}
	}
	void print() {
		System.out.printf("팀명:%s -팀원 ",teamName);
		for(Student st:members) {
			st.printName();
		}
		System.out.println();
	}

}
