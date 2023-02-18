public class MergeSort{

public void divide(int arr[],int si,int ei){
if(si==ei)
return;

int mid=(si+ei)/2;
divide(arr,si,mid);
divide(arr,mid+1,ei);
conquer(arr,si,mid,ei);
}
// Ending of divide method

public void conquer(int arr[],int si,int mid,int ei){

int i=0,j=0,k=0;
int n1=mid-si+1;
int n2=ei-mid;
int rightArray[]=new int[n1];
int leftArray[]=new int[n2];

//Loop for adding elements from old array to the new one
for(k=0;k<arr.length;k++){
if(k<=mid){
leftArray[i]=arr[k];
i++;
}
else{
rightArray[j]=arr[k];
j++;
}


i=0;j=0;k=0;

//Loop for compairing elements of new array to sort elements in the old array until
while(i<n1 && j<n2){
if(leftArray[i] <= rightArray[j]){
arr[k]=leftArray[i];
i++;k++;
}
else{
arr[k]=rightArray[j];
j++; k++;
}
}


//Loops for the remainig arrays elements
while(i<n1){
arr[k]=leftArray[i];
i++;k++;
}

while(j<n2){
arr[k]=rightArray[j];
j++;k++;
}
}
}


//Ending of the conquere method
public static void main(String arg[]){
MergeSort obj=new MergeSort();
int arr[]={5,4,1,9,8,2};
obj.divide(arr,0,5);
System.out.println("Merge sort of the given array is : ");

//Loop for printing the elements of sorted array 
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);
}
}

 





