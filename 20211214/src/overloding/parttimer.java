package overloding;

public class parttimer {
	//파트타이머의 정보
	// 오전여부 , 시급, 가게명, 본인이름
	
	private boolean afternoon;
	private int pay;
	private String shopName;
	private String name;
	
	// 생성자 오버로딩은, 생성자를 여러 개 오버로딩 형식으로 만드는 것입니다.
	
    public parttimer (boolean a, int p, String s, String n) {
    	if(p <8720) {
    		pay = 8720;
    	}
    	afternoon =a;
    	shopName = s;
    	name = n;
    	System.out.println("알바가 생성됬습니다.");
    	System.out.println("오후알바 : " + afternoon);
    	System.out.println("시급 : " + pay);
    	System.out.println("가게명 : " + shopName);
    	System.out.println("가게명 : " + name);
    	
    	
    }
    public parttimer(boolean a, String s, String n ) {
    	afternoon =a;
    	pay = 8720;
    	shopName = s;
    	name = n;
    	System.out.println("알바가 생성됬습니다.");
    	System.out.println("오후알바 : " + afternoon);
    	System.out.println("시급 : " + pay);
    	System.out.println("가게명 : " + shopName);
    	System.out.println("가게명 : " + name);
    	
    	
    }
    
  
    
    
}
