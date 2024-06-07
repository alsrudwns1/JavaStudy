package ex10accessmodifier;

/*
 * 캡슐화(Encapsulation)
 * :여러가지 업무 로직을 하나로 묶는다는 의미, 업무의 순서까지 고려한 형태의
 * 로직을 구성한다는 의미를 지님. 즉 관련있는 로직을 하나로 묶어주는 것을 뜻함.
 */
 
//아래 4가지 업무는 번호순으로 진행해야 한다고 가정함.
class MemberRegist {
	void doMemberRegist() {
		System.out.println("1.회원가입을 진행합니다.");
	}
}
class CongratulationPoint {
	void doCongratulationPoint() {
		System.out.println("3.가입축하 10포인트를 지급합니다.");
	}		
}
class AutoLogin {
	void doAutoLogin() {
		System.out.println("2.자동로그인");
	}		
}
class FirstLoginEvent {
	void doFirstLoginEvent() {
		System.out.println("4.첫 로그인 이벤트 페이지로 이동합니다. ");
	}		
}

/*
 * 업무의 순서를 고려해 관련된 메서드를 하나의 클래스로 정의.
 * 차후에는 별도의 분석 절차 없이 해당 클래스의 doProcess()메서드만
 * 호출하면 된다.
 */
 
class EncapsulLogic {	
	//각 업무를 담당할 클래스를 통해 인스턴스 생성
	MemberRegist memberRegist = new MemberRegist();
	FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
	AutoLogin autoLogin = new AutoLogin();
	CongratulationPoint congratulationPoint = new CongratulationPoint();
	
	//업무 순서를 고려해 캡슐화된 메서드 정의
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		firstLoginEvent.doFirstLoginEvent();
	}
}

public class E05Encapsulation {
	
	public static void main(String[] args) {
 
		System.out.println("캡슐화 전 코드");
		
		/*
		 * 업무의 진행순서가 중요치 않을 때, 캡슐화 이전의 코드에서는
		 * 개발자가 순서를 지키지 않은 상태에서도 실행이 가능한 코드가 된다.
		 * 즉 업무에 차질이 발생할 수 있다.
		 */
		
		MemberRegist memberRegist = new MemberRegist();
		FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoint congratulationPoint = new CongratulationPoint();
		
		memberRegist.doMemberRegist();
		firstLoginEvent.doFirstLoginEvent();
		congratulationPoint.doCongratulationPoint();
		autoLogin.doAutoLogin();
		
		System.out.println("==============================");
		
		System.out.println("캡슐화 이후 코드");
		new EncapsulLogic().doProcess();
	}
}

