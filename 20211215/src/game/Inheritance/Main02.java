package game.Inheritance;

//main 지역에서 자식(warrior) 생성자로 넘어오고
//그 생성자가 부모쪽(commoner) 생성자로 넘어온 상태
//그래서 부모쪽에서 변수를 완성을 시킴
//다시 자식 클래스로 넘어간 후 자식쪽 변수 완성시킴
//완성 후 메인지역으로 넘어간다


public class Main02 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("최지윤");
		w1.getInfo();

	}

}
