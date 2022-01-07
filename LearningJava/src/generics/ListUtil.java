package generics;

import java.util.List;

public class ListUtil {
	
	public static Object getLast1(List<?> list) {
		return list.get(list.size() - 1);
	}
	
	// Get the type automatic
	public static <T> T getLast2(List<T> list) {
		return list.get(list.size() - 1);
	}

}
