import java.util.*;
public class Grade {
	
	public static float totalMarks(ArrayList<Float> arr) {
		float sum=0;
		for(int i=0;i<arr.size();i++) {
			sum+=arr.get(i);
		}
		return sum;
	}
	
	public static float AvgMarks(ArrayList<Float> arr) {
		float sum=totalMarks(arr);
		
		return (float)(sum/arr.size());
	}
	
	public static char Grade(ArrayList<Float> arr) {
		float avg=AvgMarks(arr);
		
		if(avg>=91) {
			return 'S';
		}else if(avg>=81 && avg<=90) {
			return 'A';
		}else if(avg>=71 && avg<=80) {
			return 'B';
		}else if(avg>=61 && avg<=50) {
			return 'C';
		}else if(avg>=51 && avg<=40) {
			return 'D';
		}else
			return 'F';
		
		
	}
	
	public static void Results(ArrayList<Float> arr) {
		System.out.println("Total marks: "+totalMarks(arr));
		System.out.println("Average Percentage: "+AvgMarks(arr));
		System.out.println("Grade: "+Grade(arr));
	}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of subjects: ");
		int n=sc.nextInt();
		
		ArrayList<Float> arr=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter marks in subject "+i+" between 0 and 100");
			float a=sc.nextFloat();
			if(a<0 || a>100) {
				System.out.println("Invalid marks! Please enter again");
				a=sc.nextFloat();
			}
			arr.add(a);
		}
		
		Results(arr);
		
		
	}
}
