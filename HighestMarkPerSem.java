import java.util.Scanner;
public class HighestMarkPerSem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of semester:");
		int n = sc.nextInt();
		int[][] semMarks = new int[n][];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter no of subject in "+(i+1)+" semester:");
			int val =sc.nextInt();
			semMarks[i]= new int[val];
		}
		for(int i =0;i<semMarks.length;i++) {
			System.out.println("Marks obtained in semester "+(i+1)+":");
			for(int j=0;j<semMarks[i].length;j++) {
				semMarks[i][j]=sc.nextInt();
				if(semMarks[i][j]<0 || semMarks[i][j]>100) {
					System.out.println("You have entered invalid mark.");
					return ;
				}
			}
		}
		for(int i =0;i<semMarks.length;i++) {
			int large=0;
			System.out.print("Maximum mark in "+(i+1)+" semester:");
			for(int j=0;j<semMarks[i].length;j++) {
				if(large<=semMarks[i][j]) {
					large = semMarks[i][j];
				}
			}
			System.out.println(large);
		}
	}
}
