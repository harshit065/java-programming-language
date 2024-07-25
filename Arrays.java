import java.util.*;
public class Arrays {

    public static  int largestNumber(int number[]){
        // for (int i =0; i<number.length; i++){
        //     if(number[i] == key){
        //         return i;
        //     }
        // }
        // return -1;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        // int number []= {2,4,6,8,10,12,14,16,19};
        // int key = 10;
        // int index = linearsearch( number,  key);
        // if(index == -1){
        //     System.out.println("Not found");

        // }else{
        //     System.out.println("key is at index:" +index);

        // }
        int number []= {1,6,5,8};
        System.out.println("largest value is :"+ largestNumber(number));

        
    }

}
