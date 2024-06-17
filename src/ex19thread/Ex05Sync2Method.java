package ex19thread;

class SumMulti2 {
	int num;
	public SumMulti2() {
		num =0;
	}
	
	/*
	 * 쓰레드의 동기화 방법 1
	 * :동기화 메서드를 사용한다. 동기화가 필요한 코드를 포함한 메서드 전체를
	 * 동기화 하는 방법이다. 간단한 동기화 처리만으로 정상적인 결과가 나오는 걸
	 * 볼 수 있다.
	 */
//	synchronized public void addNum(int n) {
//		num +=n;
//	}
	
	/*
	 * 쓰레드의 동기화 방법 2
	 * : 동기화 블럭을 사용한다. 동기화가 필요한 코드에만 적용하는 방법이다.
	 * 해당 프로그램에서는 실행코드가 1줄밖에 없으므로 동기화 방법에 대한
	 * 성능차이가 거의 없다. 하지만 실행코드가 많은 경우 메서드 전체를 동기화
	 * 하는 것 보다 필요한 코드만 동기화하는 '동기화블럭' 이 더 좋은 성능.
	 */
	public void addNum(int n) {
		synchronized(this) {
			num +=n;		
		}
	}
	
	
	
	public int getNum() {
		return num;
	}
}

class MultiAdderThread2 extends Thread {
	SumMulti sumInst;
	int start, end;
	public MultiAdderThread2(SumMulti sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	public void run() {
		for(int i = start; i<=end; i++) {
			sumInst.addNum(i);
		}		
	}
}

public class Ex05Sync2Method {

	public static void main(String[] args) {
		SumMulti s = new SumMulti();
		MultiAdderThread2 mat1 = new MultiAdderThread2(s, 1, 5000);
		MultiAdderThread2 mat2 = new MultiAdderThread2(s, 5001, 10000);
		mat1.start();
		mat2.start();
		try {
			mat1.join();
			mat2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~10000까지의 합:" + s.getNum());
	}

}
