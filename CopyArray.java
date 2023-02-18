public class CopyArray{
public static void main(String arg[]){
int mid=2;
int array[]={1,2,3,4,5,6};
int leftArray[]=new int[3];
int rightArray[]=new int[3];
int i=0,j=0,k=0;

for(k=0;k<array.length;k++){
if(k<=mid){
leftArray[i]=array[k];
i++;
}
else{
rightArray[j]=array[k];
j++;
}
}

System.out.println("Elements in left Array are: ");
for(int l=0;l<leftArray.length;l++)
System.out.println(leftArray[l]);

System.out.println("Elements in Right Array are:");
for(int n=0;n<rightArray.length;n++)
System.out.println(rightArray[n]);
}
}



 