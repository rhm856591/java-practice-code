import java.io.*;
import java.util.*;
public class javalab{
public static void main(String[] args) throws IOException{
    File file = new File("C:/Users/nav/Desktop/20BCS2697.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    String[] arr = new String[100];
    int i=0;
    while ((st = br.readLine()) != null){
        arr[i] = st;
        i++;
    }
    
// print duplicate elements
System.out.println("Duplicate elements are: ");
    for(int j=0;j<i;j++){
        for(int k=j+1;k<i;k++){
            if(arr[j].equals(arr[k])){
                System.out.println(arr[j]);
            }
        }
    }

  

  
    // write unique elements to file
    // write to new file
    File file2 = new File("20BCS2697_unique.txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
    for(int j=0;j<i;j++){
        int count = 0;
        for(int k=0;k<i;k++){
            if(arr[j].equals(arr[k])){
                count++;
            }
        }
        if(count==1){
            bw.write(arr[j]);
            bw.newLine();
        }
    }
    bw.close();

}
}