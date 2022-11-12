package lotto.domain;

public class Money {
	
	private final static int MINIMUM_MONEY = 1000;
	private final int money;
	
	public Money(String input)  {
		int money = moneyCheck(input);
		dividedCheck(money);
		lowMoneyCheck(money);
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int getLottoCount() {
		return money / MINIMUM_MONEY;
	}
	
	public static int moneyCheck(String money) {
		try {
			return Integer.parseInt(money);
		} catch (NumberFormatException e) {
			System.out.println("[ERROR] 구입 금액은 숫자로 입력 받아야 합니다.");
			throw new IllegalArgumentException("[ERROR] 구입 금액은 숫자로 입력 받아야 합니다.");
		}
	}
	
	public static void dividedCheck(int money) {
		if(money % MINIMUM_MONEY == 0) {
			return;
		}
		System.out.println("[ERROR] 구입 금액은 1000원 단위로 입력 받아야 합니다.");
		throw new IllegalArgumentException("[ERROR] 구입 금액은 1000원 단위로 입력 받아야 합니다.");
	}
	
	public static void lowMoneyCheck(int money) {
		if(money < MINIMUM_MONEY) {
			System.out.println("[ERROR] 구입 금액은 1000원 이상이여야 합니다.");
			throw new IllegalArgumentException("[ERROR] 구입 금액은 1000원 이상이여야 합니다.");
		}
	}
}
