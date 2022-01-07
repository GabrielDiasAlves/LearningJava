package generics;

import java.util.Arrays;
import java.util.List;

public class ListUtilTest {
	
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		// It's necessary to specify the type
		String lastLanguage1 = (String) ListUtil.getLast1(langs);
		System.out.println(lastLanguage1);
		
		Integer lastNumber1 = (Integer) ListUtil.getLast1(nums);
		System.out.println(lastNumber1);
		
		// Get the type automatic
		String lastLanguage2 = ListUtil.getLast2(langs);
		System.out.println(lastLanguage2);
		
		Integer lastNumber2 = ListUtil.getLast2(nums);
		System.out.println(lastNumber2);
		
		
	}
}