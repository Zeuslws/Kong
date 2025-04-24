public class zZZZZzzSortyMcSortFace {

public static void sorterino(int[] numz){
for(int j=0;j<numz.length;j++)
{
for(int i=0;i<numz.length-1;i++)
{
if(numz[i]>numz[i+1]){ // fixed: now it sorts ascending
int swapTemp= numz[i]; 
numz[i]=numz[i+1];
numz[i+1]=swapTemp;
}
}
} 
System.out.println("done maybe?")
}

public static void main(String args[]){
int mehArray[]={5,3,8,1,2};
sorterino(mehArray);
for(int p=0;p<mehArray.length;p++)System.out.print(mehArray[p]+" ");
}
}
