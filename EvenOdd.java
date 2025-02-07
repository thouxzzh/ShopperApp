import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class EvenOdd{
  public static void main(String args[]){
    try{
      File file=new File("input.txt");
      Scanner sc=new Scanner(file);
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      int odd=0;
      int even=0;
      for(int i=0;i<size;i++){
        if(arr[i]%2==0){
          even++;
            }
        else{
          odd++;
        }
      }
 System.out.println("odd"+odd+" even"+even);
      sc.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Error:File not found");
      e.printStackTrace();
    }
  }
}
