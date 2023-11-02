package lotto.factory;

import lotto.RandomNumberProvider;
import lotto.type.LottoType;

import java.util.List;

public class RandomNumberFactory {
    private final List<RandomNumberProvider> randomNumberProviders;

    public RandomNumberFactory(List<RandomNumberProvider> randomNumberProviders) {
        this.randomNumberProviders = randomNumberProviders;
    }

    public RandomNumberProvider find(LottoType lottoType) {
        return randomNumberProviders.stream()
                .filter(v -> v.supports(lottoType))
                .findFirst()
                .orElseThrow();
    }

}