import java.util.Scanner;


public class Grade {
	public static void main(String args[]){
		//รับค่าคะแนนสามค่า มิดเทอม ไฟนอล โปรเจค
		//นำคะแนนมารวมกัน
		//คำนวณเกรดออกมา
		
		int[] i = new int[30];
				
		int midTerm;
		int finalTerm;
		int project;
		String grade = "";
		Scanner collectpoint = new Scanner(System.in);
		i[1] += 1; i[2] += 1; i[3] += 1; i[4] += 1; i[5] += 1; 
		
		System.out.println("Input 3 Scores");
		i[6] += 1;
		midTerm = collectpoint.nextInt();
		i[7] += 1;
		finalTerm = collectpoint.nextInt();
		i[8] += 1;
		project = collectpoint.nextInt();
		i[9] += 1;
		
		i[10] += 1;if((midTerm + finalTerm + project >= 80)&&(midTerm + finalTerm + project <= 100 )){
			grade = "A";
			i[11] += 1;
		}else{i[12] += 1; if((midTerm + finalTerm + project >= 75)&&(midTerm + finalTerm + project <= 79)){
			grade = "B+";
			i[13] += 1;
		}else{i[14] += 1; if((midTerm + finalTerm + project >= 70)&&(midTerm + finalTerm + project <= 74)){
			grade = "B";
			i[15] += 1;
		}else{i[16] += 1; if ((midTerm + finalTerm + project >= 65)&&(midTerm + finalTerm + project <= 69)){
			grade = "C+";
			i[17] += 1;
		}else{i[18] += 1; if((midTerm + finalTerm + project >= 60)&&(midTerm + finalTerm + project <= 64)){
			grade = "C";
			i[19] += 1;
		}else{i[20] += 1; if((midTerm + finalTerm + project >= 55)&&(midTerm + finalTerm + project <= 59)){
			grade = "D+";
			i[21] += 1;
		}else{i[22] += 1; if((midTerm + finalTerm + project >= 50)&&(midTerm + finalTerm + project <= 54)){
			grade = "D";
			i[23] += 1;
		}else{i[24] += 1; if((midTerm + finalTerm + project >= 0)&&(midTerm + finalTerm + project <= 49)){
			grade = "F";
			i[25] += 1;
		}}}}}}}}
		i[26] += 1;
		System.out.println(grade);
		i[27] += 1;
		
		for(int j = 1; j <= 27; j++){
			System.out.println("p[" + j + "]" + " = " + i[j]);
		}
	}
}
