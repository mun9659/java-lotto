package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lotto.domain.Money;
import lotto.domain.Lotto;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }
    
    // 아래에 추가 테스트 작성 가능
	@DisplayName("로또 구입 금액 입력_정상처리")
	@Test
	void inputMoneyByCorrect() {
		// Customer customer = new Customer();
		
		// assertThat(customer.times).isEqualTo(8);
	}
	
	@DisplayName("로또 구입 금액 입력_에러처리1")
	@Test
	void inputMoneyByError1() {
		assertThatThrownBy(() -> new Money("1001"))
		.isInstanceOf(IllegalArgumentException.class);
	}
	
	@DisplayName("로또 구입 금액 입력_에러처리2")
	@Test
	void inputMoneyByError2() {
		assertThatThrownBy(() -> new Money("100B"))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
