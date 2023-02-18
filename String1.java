public class String1{
public static void main(String arg[]){
String han="hannan shaikh"
;
int count=0;
for(int i=0;i<han.length();i++){
if(han.charAt(i) != ' ')
count++;
}
System.out.println("Total number of character in string is: "+count);
}
}
