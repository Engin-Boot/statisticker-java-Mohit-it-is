package statisticker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Statistics 
{
	
    public static Stats getStatistics(List<Float> numbers) {
    	Stats stats = new Stats();
    	
    	if(numbers.isEmpty())
    		return stats;
    	
    	stats.min = Collections.min(numbers);
    	stats.max = Collections.max(numbers);
    	
    	Float sum = 0.0f;
    	for(Float i: numbers) {
    		sum = sum + i;
    	}
    	stats.average = sum;
    	
		return stats;
       
    }
}
