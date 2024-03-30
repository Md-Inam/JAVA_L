/* 
 * This Program gives two outputs
 * 1. The elements of an array declared in the same class
 * 2. The elements of an array declared in a different class  
*/
public class IterateArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("The elements are:");
        for(int i:arr){
            System.out.printf("%d\t",i);
        }
        ComArray co = new ComArray();
        System.out.println("\nThe Elements of next class are");
        for(int i: co.arr3){
            System.out.printf("%d\t",i);
        }
    }
    
}
