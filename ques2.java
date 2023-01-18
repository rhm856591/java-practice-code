import java.util.ArrayList;

public class ques2 {
	
	public String @testfindName(ArrayList<String> employees, String name){
		String result = "";
		
		if(employees.contains(name)){
			result="FOUND";
		} else {
			result="NOT FOUND";
		}
		
		return result;
	}
	
}