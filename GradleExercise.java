import java.util.Scanner;

int triangle(int n){
	if(n > Integer.MAX_VALUE || n < 0){
		System.out.println("Sorry - invalid entry. Please try again.");
		System.exit(1);
	}
	if(n == 1){
		return 1;
	}
	else{
		return n + (n - 1);
	}
}

int lazy(int n){
	
}