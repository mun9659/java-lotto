package lotto.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import camp.nextstep.edu.missionutils.Randoms;

public class Lotto {
	private static final int MIN_RANGE_NUMBER = 1;
	private static final int MAX_RANGE_NUMBER = 45;
	private static final int MAXIMUM_LENGTH = 6;
	
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        duplicate(numbers);
        numbers.sort(null);
        this.numbers = numbers;
    }
    
    public static Lotto newLotto() {
    	return new Lotto(Randoms.pickUniqueNumbersInRange(MIN_RANGE_NUMBER, MAX_RANGE_NUMBER, MAXIMUM_LENGTH));
    }
    
    public List<Integer> getLottoNumbers() {
    	return numbers;
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
