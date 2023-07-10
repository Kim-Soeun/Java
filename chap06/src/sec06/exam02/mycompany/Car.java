package sec06.exam02.mycompany;

import sec06.exam02.hankook.*;		
import sec06.exam02.kumho.*;		// import : 다른 패키지 폴더를 가져옴
									// import 자동 단축키 : ctrl + shift + o

public class Car {

	SnowTire tire1 = new SnowTire();
//	Tire tire2 = new Tire();  똑같은 이름의 클래스를 2개 import 시킴(그래서 그냥 Tire라고만 쓰면 안됨)
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
	
}
