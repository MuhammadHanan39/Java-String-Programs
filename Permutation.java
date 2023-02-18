public class Permutation{


	public void permut(String str ,String perm){
	if(str.length()==0){
	System.out.println(perm);
	return;
	}
  
	for(int i=0;i<str.length();i++){
	  char ch=str.charAt     x 
	  String newStr=str.substring(0,i)+str.substring(i+1);
	  permut(newStr,perm+ch);
	   }
	}	 


	public static void main(String arg[]){
	   String str="abc";
	   String perm=" ";
	   Permutation obj=new Permutation();	   
		obj.permut(str,perm);
}
}	
