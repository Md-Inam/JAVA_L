/*
*This Program gives the output of the common element in between two arrays 
*/
public class ComArray {
    int[] arr3 = {98,87,88,5,4,5,21,11};
    public static void main(String[] args){
        int i = 0;
        int[] arr1 = {8,9,5,4,9,7,88};
        int[] arr2 = {12,5,7,2,4,3,88,4,1,0};
        for(i=0;i<arr1.length;i++){
            for (int j = 0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    System.out.println(arr2[j]);
                }
            }
        }
    }
    
}
