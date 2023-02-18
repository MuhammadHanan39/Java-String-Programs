public class UpperLower{
public static void main(String arg[]){
String name1="HanaN ShaiKh";
StringBuffer new2=new StringBuffer(name1);
for(int i=0;i<name1.length();i++){
if(Character.isLowerCase(name1.charAt(i)))
new2.setCharAt(i,Character.toUpperCase(name1.charAt(i)));
else if(Character.isUpperCase(name1.charAt(i)))
new2.setCharAt(i,Character.toLowerCase(name1.charAt(i)));
}
System.out.println(new2);
}
}