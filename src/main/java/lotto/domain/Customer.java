package lotto.domain;

import camp.nextstep.edu.missionutils.Console;
import lotto.constants.Constants;

public class Customer {
	
	public int times;
	
	public Customer()  {
		System.out.println(Constants.inputMoneyMessage);
		String money = Console.readLine();
		dividedCheck(money);
		numberCheck(money);
		setTimes(money);
	}
	
	public void setTimes(String money) {
		this.times = Integer.parseInt(money) / Constants.DIVIDED_THOUSAND;
	}
	
	public static void dividedCheck(String money) {
		int Integer_money = Integer.parseInt(money);
		if(Integer_money % Constants.DIVIDED_THOUSAND == 0) {
			return;
		}
		throw new IllegalArgumentException();
	}
	
	public static void numberCheck(String money) {
		for(int i = 0; i < money.length(); i++) {
			if(Character.isDigit(money.charAt(i)) == false) {
				throw new IllegalArgumentException();
			}
		}
	}
}
