package structure;

public class E_Structure03_190p {
	
	public static void getInfo(D_cat b) {
		System.out.println("이름 : " + b.name + "이고, 색상은 " + b.color + "입니다.");
	}

	public static void main(String[] args) {
		
		
		D_cat a1 = new D_cat();
		
		a1.name = "만두";
		a1.color= "노란색";
		
		D_cat a2 = new D_cat();
		
		a2.name = "두부";
		a2.color = "하얀색";
		
		
		getInfo(a1);
		getInfo(a2);

	}

}
