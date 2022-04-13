import java.util.Scanner;
public class Main {
public static void main(String[] args) {
//Nicolas, Nigel D. BSIT-1A
//21-020212
Scanner scan = new Scanner(System.in);
System.out.print("Enter your Height: ");
float userHeight = scan.nextFloat();
System.out.print("Enter your Weight: ");
float userWeight = scan.nextFloat();
float bmi = userWeight / (userHeight * userHeight);
if (bmi <= 18.5) {
System.out.println("The User is Underweight");
}else if (bmi >= 18.5 && bmi <= 24.9) {
System.out.println("The User is Normalweight");
}else if (bmi >= 25 && bmi <= 29.9){
System.out.println("The User is Overweight");
}else if(bmi >= 30) {
System.out.println("The User is Obese");
}
}
}
