package lotto.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        duplicate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }
    
    private void duplicate(List<Integer> numbers) {
    	Set<Integer> set = new HashSet<>();
    	for(int i = 0; i < numbers.size(); i++) {
    		set.add(numbers.get(i));
    	}
    	if(set.size() == numbers.size()) {
    		return;
    	}
    	throw new IllegalArgumentException();
    }
}
