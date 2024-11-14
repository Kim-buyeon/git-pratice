package weekFour;

import java.util.ArrayList;
import java.util.Scanner;

public class Deparement {
	ArrayList<Student>stdList = new ArrayList<>();
	ArrayList<Team>teamList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	void readAllStudents() {
		String id;
		Student std = null;
		while(true) {
			id = scanner.next();
			if(id.equals("0"))break;
			std = new Student(id);
			std.read(scanner);
			stdList.add(std);
		}
		
	}
	void readAllTeams(Deparement dept){
		String teamName;
		Team t = null;
		while(true) {
			teamName = scanner.next();//팀명 여기서 읽어줘야함
			if(teamName.equals("0"))break;
			t = new Team(teamName);
			t.read(scanner, this);
			teamList.add(t);
			
		}
	}
	void printTeams(){
		for(Team t:teamList) {
			t.print();
		}
	}
	void printAllStudents() {
		for(Student st:stdList) {
			st.print();
		}
	}
	Student findStudent(int n) {
		for(Student std: stdList) {
			if(std.matchesId(n)) {
				return std;
			}
		}
		return null;
	}void mymain(){
		readAllStudents();
		readAllTeams(this);
		printAllStudents();
		printTeams();
	}

	public static void main(String[] args) {
		Deparement dept = new Deparement();
		dept.mymain();
	}

}
