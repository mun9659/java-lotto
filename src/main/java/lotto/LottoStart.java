package lotto;

import lotto.domain.Money;
import lotto.view.Input;

public class LottoStart {
	
	private LottoStart() {
		
	}
	
	public static LottoStart newLottoStart() {
		return new LottoStart();
	}
	
	public void run() {
		Money money = new Money(Input.getMoneyFromCustomer());
		System.out.println(money.getMoney());
	}
}
