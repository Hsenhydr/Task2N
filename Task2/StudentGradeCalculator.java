package Task2;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter nb of grades");
		float gno= input.nextFloat();
		float sum=0;
		String grade;
		for(int i=0;i<gno;i++)
		{
			System.out.printf("Enter Mark no\"%d\n",+i+1);
			float mark=input.nextFloat();
			sum=sum+mark;
		}
		float average=(sum/gno);
		if(average>80.0)
		{
			grade="A";	
		}
		else if(average>70.0)
		{
			grade="B";
		}
		else if(average>60.0)
		{
			grade="C";
		}
		else if(average>50.0)
		{
			grade="C-";
		}
		else if(average>40.0)
		{
			grade="D";
		}
		else grade="F";
	
		System.out.printf("Total Marks=%.2f\n",sum);
		System.out.printf("Average percentage=%.2f\n",average);
		System.out.printf("Your Grade=%s\n",grade);
	}

}