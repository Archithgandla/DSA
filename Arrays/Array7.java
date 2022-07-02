//Array rotation
//Right Rotation : ClockWise Direction
//Left Rotation : Anticlockwise Rotation


public class Array7 {


    static int[] lRotation(int[] a){
        
        int temp = a[a.length-1];

        for(int i=a.length-2;i>=0;i--)
            a[i+1] = a[i];

        a[0] = temp;
        return a;
    }

    static int[] rRotation(int[] b){
        
        int temp = b[0];

        for(int i=0;i<b.length-1;i++)
            b[i]=b[i+1];
        
        b[b.length-1] = temp;

        


        return b;
    }




    public static void main(String[] args){

        int[] a = {1,2,3,4,5,6,7,8,9};

       /* int temp[] = lRotation(a);

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }*/

        System.out.println(" ");
        int[] temp = rRotation(a);

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }

    }
}
