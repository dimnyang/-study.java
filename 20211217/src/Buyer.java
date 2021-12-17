
public class Buyer {
	
	private int money; // 소지금
	private int mango; // 소지망고개수
	private int apple;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.apple = 0;
	}
	
	public void buyMango(Seller seller, int mango) {
		if((mango*4000) > this.money) {
			System.out.println("돈이 모자랍니다.");
			return;
		}
		if(seller.getMango() < mango) {
			System.out.println("망고재고가 부족합니다. 망고 재고 : " + seller.getMango());
			return;
		}
		this.money -= mango * 4000;
		this.mango += mango;
		//이때 seller쪽에서도 sellMango()가 호출되도록 처리하며
		// seller의 망고를 차감하고 돈을 올려주는 로직
		seller.sellMango(mango);
	}
	
	public void buyApple(Seller seller, int apple) {
		if((apple*1000) > this.money) {
			System.out.println("돈이 모자랍니다.");
			return;
		}
		if(seller.getApple() < apple) {
			System.out.println("사과재고가 부족합니다. 망고 재고 : " + seller.getApple());
			return;
		}
		this.money -= apple * 1000;
		this.apple += apple;
		//이때 seller쪽에서도 sellMango()가 호출되도록 처리하며
		// seller의 망고를 차감하고 돈을 올려주는 로직
		seller.sellApple(apple);

}
}

