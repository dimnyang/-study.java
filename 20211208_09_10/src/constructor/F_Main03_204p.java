package constructor;

public class F_Main03_204p {

	public static void main(String[] args) {
		
		
		E_Webtoon w1 = new E_Webtoon("기기괴괴" , 1, "최지윤" , false);
        
		
		w1.getInfo();
		w1.uploadWebtoon();
		w1.getInfo();
		w1.completeWebtoon();
		w1.getInfo();
		
	}

}
