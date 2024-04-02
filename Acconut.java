package odeject_class;

import java.time.temporal.TemporalAmount;

//은행계좌 클래스(신한은행) // 멤버변수 어쩌구~ 추가
public class Acconut {
	//클래스 안에 사용할 멤버변수(필드) 필드는 클래스를 생성하고 나서 값을 저장하는 변수이다. (매개변수 외부에서 받는 변수 멤버면수 클래스에서 받는변수)
	static final String BANKNAME="신한은행"; //상수 static 이 붙으면정적멤버변수가됨. 안붙으면 인스턴스멤버변수
	String accountNo; //계좌번호 인스턴스멤버변수= 객체이름을 봍해서 접근한다.
	String ownerNamw; //예금주이름
	int balance;	//잔액
	//메서드(기능) void=리턴값이 없다. 메서드는 2가지가 있다. 내가 만드는것 밨에서 받아쓰는것
	
	//생정자: 객체를 조기화 하는 동시에 생성하는것. 클래스를 생성하면서 클래스 이름이다. 생성자를 만들지 않으면 빈생성자가 생김.
	public Acconut(String accountNo, String ownerNamw, int balance) { // 매개변수로 값을 3개 받는 생성자
			this.accountNo=accountNo; // 매개변수이름과 멤버변수이름이 같을때 앞에 this.로 구분한다. this.하고 만든건 멤버변수
			this.ownerNamw=ownerNamw;
			this.balance=balance;
	}
	//생성자
	public Acconut() {//매개변수로 부터 아무것도 안받음
		
	}

	
	//예금한다 메서드
	void deposit(int amonut) { //void 메서드를 수행 (리턴값이 없임)
		balance+=amonut; 
	}
	
	//인출한다는 메서드
	int withdraw(int amount) throws Exception{//메서드에 예외가 생기면 예외를 만든쪽에 전달해주겠다는 뜻
		if(balance < amount) { //예외처리 인위적으로 만들어냄
			throw new Exception("잔액이 부족합니다.");
		}
		balance-= amount;
		return amount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
