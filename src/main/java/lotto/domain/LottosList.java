package lotto.domain;

import java.util.*;

public class LottosList {
	
	private List<Lotto> lottos = new ArrayList<>();
	
	private LottosList() {
	}
	
	public static LottosList newLottosList() {
		return new LottosList();
	}
	
	public List<Lotto> lottos() {
		return lottos;
	}
	
	public void addLotto(Lotto lotto) {
		lottos.add(lotto);
	}
}
