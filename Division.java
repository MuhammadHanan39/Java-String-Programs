public class Division{
public static void main(String arg[]){
String s1="aaabbbccc";
for(int i=2;i<s1.length();i++){
if(s1.length()%i==0){
for(int j=0;j<s1.length();j=j+i){
System.out.print(s1.substring(j,j+i));
System.out.println();
}
}
}
}
}