package statisticker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Statistics 
{
	public static List<Float> RemoveNaNifPresent(List<Float> numbers){
		
		List<Float> new_list_of_numbers = new ArrayList<Float>(numbers);
		new_list_of_numbers.removeAll(Collections.singleton(Float.NaN));
		
		return new_list_of_numbers;
		
	}
	
    public static Stats getStatistics(List<Float> numbers) {
    	Stats stats = new Stats();
    	
    	List<Float> list_without_NaN = RemoveNaNifPresent(numbers);
    	
    	if(list_without_NaN.isEmpty())
    		return stats;
    	
    	stats.min = Collections.min(list_without_NaN);
    	stats.max = Collections.max(list_without_NaN);
    	
    	Float sum = 0.0f;
    	for(Float num: list_without_NaN) {
    		sum = sum + num;
    	}
    	stats.average = sum/list_without_NaN.size();
    	
		return stats;
       
    }
}
