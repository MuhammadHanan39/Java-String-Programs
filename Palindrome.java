public class Palindrome{
public static void main(String arg[]){
String name="hannah";
boolean result=true;
int index=name.length()-1;
for(int i=0;i<=name.length()/2;i++){
if(name.charAt(i)!=name.charAt(index-i)){
result=false;
break;
}
}
if(result)
System.out.println("String is palindrome");
else
System.out.println("String is not palindrome");
}
}