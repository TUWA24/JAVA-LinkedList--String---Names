
import java.util.Arrays;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		  
		        LinkedList<String[]> Values = new LinkedList<>();
		        
		      
		        
		        String[] first = {"Joshua", "123"};
		        String[] second = {"Steven", "1234"};
		        String[] third = {"James", "345"};
		        
		        Values.add(first);
		        Values.add(second);
		        Values.add(third);
		        
		        for (int i = 0; i <Values.size(); i++){
		            System.out.println(Arrays.toString(Values.get(i)));
		        }
		     
	}
		    }
		