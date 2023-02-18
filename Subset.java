import java.util.Scanner;
public class Subset{
public static void main(String arg[]){
String str1;
Scanner input=new Scanner(System.in);
System.out.println("Enter the string to find its subsets");
str1=input.next();
System.out.println("Subset of strings are : ");
for(int i=0;i<str1.length();i++){
for(int j=1;j<=str1.length()-i;j++){
System.out.print(str1.substring(i,i+j)+"  ");
}
}
}
}