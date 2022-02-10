package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pairs<K extends Number, V> {

	private final Set<Pair<K, V>> item = new LinkedHashSet<>();

	public void add(K key, V value) {
		if(key == null) return; //Just exit
		
		Pair<K, V> newPair = new Pair<K, V>(key, value);
		
		if(item.contains(newPair)) {
			item.remove(newPair);
		}
		
		item.add(new Pair<K, V>(key, value));
	}
	
	public V getValue(K key) {
		if(key == null) return null;
		
		Optional<Pair<K, V>> pairOptional = item.stream()
				.filter(pair -> key.equals(pair.getKey()))
				.findFirst();
		
		return pairOptional.isPresent() ? pairOptional.get().getValue() : null;
	}
	
}
