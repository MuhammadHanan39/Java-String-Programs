import java.util.Arrays;
public class Anagram{
public static void main(String arg[]){
String s1="hannan";
String s2="nananh";

if(s1.length()!=s2.length()){
System.out.println("Error");
System.exit(0);}

s1=s1.toLowerCase();
s2=s2.toLowerCase();

char[] string1=s1.toCharArray();
char[] string2=s2.toCharArray();

Arrays.sort(string1);
Arrays.sort(string2);

if(Arrays.equals(string1,string2)==true)
System.out.println("Strings are Anagram ");
else
System.out.println("Strings are not Anagram");
}
}
