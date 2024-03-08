package week3.day2;

public class ReverseStarPattern {
public static void main(String[] args) {
	int n=5;
	int k=n*2-2;
    for(int i=0; i<n; i++){
        for(int j=0; j<k; j++){
            System.out.print(" ");
        }
        k = k - 2;
        for(int j=0; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
	
	
}
}
