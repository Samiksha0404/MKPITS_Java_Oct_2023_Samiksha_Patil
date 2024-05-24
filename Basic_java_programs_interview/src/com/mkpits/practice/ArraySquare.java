public class ArraySquare {
    public static void main(String[] args) {
    
        int[] oriArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
       
        int[] squareArray = new int[10];
        
  
        for (int i = 0; i < oriArray.length; i++) {
            squareArray[i] = oriArray[i] * oriArray[i];
        }
        
      
        System.out.println("Original Array:"printArray(oriArray));
        
        
        System.out.println("Squared Array:");
        printArray(squareArray);
    }
    
  
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
