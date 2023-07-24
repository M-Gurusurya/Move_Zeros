import java.util.Scanner;

public class Move_Zeros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        makeMoveZeroes(array,size);
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void makeMoveZeroes(int array[],int size)
    {
        for(int i=0;i<size;i++)
        {
            int temp=array[i];
            if(array[i]==0)
            {
                for(int j=i+1;j<size;j++)
                {
                    array[j-1]=array[j];
                }
                array[size-1]=temp;
            }
        }
    }
}
