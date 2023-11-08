package lotto.domain;

import java.util.Objects;

public class LottoNumber {
    public static final int MINIMUM_VALUE = 1;
    public static final int MAXIMUM_VALUE = 45;

    private final int value;

    public LottoNumber(int value) {
        validateRange(value);

        this.value = value;
    }

    private void validateRange(int value) {
        if (value < MINIMUM_VALUE || value > MAXIMUM_VALUE) {
            throw new IllegalArgumentException(
                    String.format("로또 번호는 %d에서 %d사이의 숫자여야 합니다.", MINIMUM_VALUE, MAXIMUM_VALUE));
        }
    }

    public int value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LottoNumber that = (LottoNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "LottoNumber{" +
                "value=" + value +
                '}';
    }
}
