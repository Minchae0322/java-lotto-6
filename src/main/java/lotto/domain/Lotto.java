package lotto.domain;

import java.util.List;


public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
        if(numbers.stream().distinct().count() != 6){
            throw new IllegalArgumentException();
        }
    }

    public int getMatchingNumber(List<Integer> consumerNumber) {
        return numbers.stream()
                .filter(consumerNumber::contains)
                .toList()
                .size();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
