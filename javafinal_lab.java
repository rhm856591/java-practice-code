import java.io.*;
import java.util.*;
public class javafinal_lab{
public static void main(String[] args) throws IOException{
    File file = new File("20BCS5161.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    String[] arr = new String[100];
    int i=0;
    while ((st = br.readLine()) != null){
        arr[i] = st;
        i++;
    }
    
System.out.println("Duplicate elements are: ");
    for(int j=0;j<i;j++){
        for(int k=j+1;k<i;k++){
            if(arr[j].equals(arr[k])){
                System.out.println(arr[j]);
            }
        }
    }


    File file1 = new File("20BCS5161_unique.txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
    for(int j=0;j<i;j++){
        for(int k=j+1;k<i;k++){
            if(arr[j].equals(arr[k])){
                arr[k] = "";
            }
        }
    }
    for(int j=0;j<i;j++){
        if(arr[j] != ""){
            bw.write(arr[j]);
            bw.newLine();
        }
    }
    bw.close();

  

  
    

}
}