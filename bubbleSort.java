import java.lang.Integer;
public class bubbleSort{
  public static void main(String[] args){
    int length = args.length;
    int[] array = new int[length];
    for(int i = 0; i < length; i++){
      array[i] = Integer.parseInt(args[i]);
    }
    for(int j = length; j > -1; j--){
      for(int i = 0; i < length-1; i++){
        if(array[i] > array[i+1])
          swap(i, i+1, array);
      }
    }
    print(length, array);
  }
  
  public static void swap(int a, int b, int[] array){
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
  
  public static void print(int length, int[] array){
    for(int i = 0; i < length; i++)
      System.out.print(array[i]+ " ");
    System.out.println();
  }
}