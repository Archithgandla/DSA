//Reverse a array



class Array1{

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        int temp = 0;
        
        for(int i=0;i<arr.length/2;i++){

            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
            
        }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }



}
}

/*

    Alternate logic

    i = 0;
    j = n-1;

    while(i<j){
        swap(i,j);
        i++;
        j--;
    }


*/

















