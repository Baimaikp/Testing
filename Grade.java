import java.util.Scanner;


public class Grade {
	public static void main(String args[]){
		//รับค่าคะแนนสามค่า มิดเทอม ไฟนอล โปรเจค
		//นำคะแนนมารวมกัน
		//คำนวณเกรดออกมา
				
		int midTerm;
		int finalTerm;
		int project;
		String grade = "";
		Scanner collectpoint = new Scanner(System.in);
		
		System.out.println("Input 3 Scores");
		midTerm = collectpoint.nextInt();
		finalTerm = collectpoint.nextInt();
		project = collectpoint.nextInt();
		
		if((midTerm + finalTerm + project >= 80)&&(midTerm + finalTerm + project <= 100 )){
			grade = "A";
		}else if((midTerm + finalTerm + project >= 75)&&(midTerm + finalTerm + project <= 79)){
			grade = "B+";
		}else if((midTerm + finalTerm + project >= 70)&&(midTerm + finalTerm + project <= 74)){
			grade = "B";
		}else if ((midTerm + finalTerm + project >= 65)&&(midTerm + finalTerm + project <= 69)){
			grade = "C+";
		}else if((midTerm + finalTerm + project >= 60)&&(midTerm + finalTerm + project <= 64)){
			grade = "C";
		}else if((midTerm + finalTerm + project >= 55)&&(midTerm + finalTerm + project <= 59)){
			grade = "D+";
		}else if((midTerm + finalTerm + project >= 50)&&(midTerm + finalTerm + project <= 54)){
			grade = "D";
		}else if((midTerm + finalTerm + project >= 0)&&(midTerm + finalTerm + project <= 49)){
			grade = "F";
		}
		
		System.out.println(grade);
		
	}
}
