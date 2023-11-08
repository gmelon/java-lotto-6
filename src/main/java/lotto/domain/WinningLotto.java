package lotto.domain;

import java.util.List;

public class WinningLotto {
    private final Lotto lotto;
    private final LottoNumber bonusNumber;

    public WinningLotto(List<Integer> numbers, int bonusNumber) {
        this.lotto = new Lotto(numbers);
        this.bonusNumber = new LottoNumber(bonusNumber);

        validateBonusNumberDuplicated();
    }

    private void validateBonusNumberDuplicated() {
        if (lotto.contains(bonusNumber)) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호와 보너스 번호는 중복될 수 없습니다.");
        }
    }
}
