package constructor;

public class E_Webtoon {
	
	public String name;
	public int serise;
	public String painter;
	public boolean complete;
	
	public E_Webtoon(String n, int s, String p, boolean c) {
		name = n;
		serise = 1;
		painter = p;
		complete = false;
		
	} public void getInfo() {
		System.out.println("제목은 : " + name + ",회차는 :" + serise + ", 작가는 :" + ", 완결여부는 : " + complete);
		
	}public void uploadWebtoon() {
		serise += 1;
	}public void completeWebtoon() {
		complete = true;
	}
	
	
	
	

}
