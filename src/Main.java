
public class Main {

	public static void main(String[] args) {

		자동차 a자동차1 = new 자동차();
		//자동차 타입의 a자동차1이라는 변수에 자동차라는 객체를 넣는다
		a자동차1.최고속력 = 200;
		//a자동차1을 조종할수 있는 최고속력이라는 리모컨에 200을 넣는다
		System.out.println("a자동차1의 최고속력은" + a자동차1.최고속력 + "입니다");
		//a자동차1.최고속력은 200이라는 값을 가지고 있다

		자동차 a자동차2 = new 자동차();
		//자동차 타입의 a자동차2이라는 변수에 자동차라는 객체를 넣는다
		a자동차2.최고속력 = 180;
		//a자동차2을 조종할수 있는 최고속력이라는 리모컨에 180을 넣는다
		System.out.println("a자동차2의 최고속력은" + a자동차2.최고속력 + "입니다");
		//a자동차2.최고속력은 180이라는 값을 가지고 있다
	}

}

class 자동차 {
	int 최고속력;
	//자동차의 설계도 안에 최고속력이라는 변수를 넣어준다
}