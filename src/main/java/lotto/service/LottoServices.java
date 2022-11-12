package lotto.service;

import lotto.domain.Lotto;
import lotto.domain.LottosList;
import lotto.domain.Money;
import lotto.view.View;

public class LottoServices {
	
	public static LottosList newLottosCustomerBuy(Money money) {
		LottosList lottosList = LottosList.newLottosList();
		int lottoCount = money.getLottoCount();
		View.printCountingLotto(lottoCount);
		for(int i = 0; i < lottoCount; i++) {
			lottosList.addLotto(Lotto.newLotto());
		}
		for(Lotto lotto : lottosList.lottos()) {
			System.out.println(lotto.getLottoNumbers());
		}
		return lottosList;
	}
	
}
