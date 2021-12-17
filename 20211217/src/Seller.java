
public class Seller {

	private int money; // 매출액
	private int mango; // 재고
	private int apple; 
	
	public Seller(int mango, int apple) {
		this.money = 0;
		this.mango = mango;	
		this.apple = apple;
		
	}
	
	public void sellMango(int mango) {
		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다. 현재 재고 : " + this.mango);
			return;
		}
}
		
		public void sellApple(int apple) {
			if(this.apple < apple) {
				System.out.println("사과가 모자랍니다. 현재 재고 : " + this.apple);
				return;
		
	}
			
}

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		public int getMango() {
			return mango;
		}

		public void setMango(int mango) {
			this.mango = mango;
		}

		public int getApple() {
			return apple;
		}

		public void setApple(int apple) {
			this.apple = apple;
		}
	
}
