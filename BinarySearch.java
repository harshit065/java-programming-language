public class BinarySearch {
    // public static int binarySearch(int number[], int key){
    //     int start = 0 , end = number.length-1;

    //     while(start<=end){
    //         int mid = (start + end)/2;

    //         //comparision
    //         if(number[mid] == key){
    //             return mid;
    //         }
    //         if(number[mid]< key){
    //             start = mid +1;
    //         }else{
    //             end = mid -1;
    //         }

    //     }
    //     return -1;
    // }
    // public static void main(String [] args){
    //     int number[]={2,4,6,8,7,8,10};
    //     int key = 8;
    //     System.out.println("index is for key is: " + binarySearch(number,key));
    // }

    //REVERSE ARRAY
    // public static void reverse(int number[]){
    //     int first = 0, last = number.length-1;

    //     while(first < last){
    //         //swap
    //         int temp= number[last];
    //         number[last] = number[first];
    //         number[first]= temp;

    //         first++;
    //         last--;
    //     }
    // }
    // public static void main(String[] args) {
    //     int number[] = {2,4,5,7,5};
    //     reverse(number);

    //     for (int i =0; i<number.length; i++){
    //         System.out.print(number[i]+ " ");

    //     }
    //     System.out.println( " ");

    // }

    //PAIRS ARRAY
    // public static void Pairs(int number[]){
    //     for (int i= 0; i<number.length; i++){
    //         int curr = number[i];
    //         for (int j = i+1; j<number.length; j++){
    //             System.out.print("(" + curr + "," + number[j]+" )");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     int number[] = {2,4,6,8,10};
    //     // System.out.println(number);
    //     Pairs(number);

    // }

    //subarray

    // public static void subarray(int number[]){
    //     int ts = 0;
    //     for(int i =0; i<number.length;i++){
    //         int start = i;
    //         for( int j = i; j<number.length; j++){
    //             int end = j;
    //             for(int k = start; k<=end; k++){
    //                 System.out.print(number[k]+ " ");
    //             }
    //             ts++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("total subarray = " + ts);
    // }
    // public static void main(String [] args){
    //     int number[] = {2,4,6,8,10};
    //     subarray(number);
    // }

    //max subarray
    public static void Maxsubarray(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
                for(int i =0; i<number.length;i++){
            int start = i;
            for( int j = i; j<number.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){
                    // System.out.print(number[k]+ " ");
                    currSum += number[k];
                }
                
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String [] args){
        int number[] = {2,4,6,8,10};
        Maxsubarray(number);
    }
    
}
