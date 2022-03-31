package scheduler;

public class PriorityAllocation implements Scheduler {
	
	@Override
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill이 가장 높은 상담원의 대기열 앞에 우선 배분합니다.");
	}
	
}