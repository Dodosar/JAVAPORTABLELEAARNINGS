package CollectionExercise;

import java.util.HashMap;
import java.util.Map;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestResultsMapsExample result = new TestResultsMapsExample();
		
		Map<String,Integer> originalGrades = result.getOriginalGrades();
		
		Map<String,Integer> makeUpGrades = result.getMakeUpGrades();
		
		for(var entry : makeUpGrades.entrySet()) {
			Integer firstGrade = originalGrades.get(entry.getKey());
			Integer secondGrade = makeUpGrades.get(entry.getKey());
		
		
		if(secondGrade > firstGrade) {
			originalGrades.put(entry.getKey(), secondGrade);
		}
		}
		
		System.out.println("Final Grades:");
		originalGrades.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));
		}	
	}


