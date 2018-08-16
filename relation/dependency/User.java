package kr.co.nextree.classdiagram.relation.dependency;

public class User {
	
    public Schedule crateSchedule() {
    	// 객체 생성 및 리턴
        return new Schedule();
    }
    
    public void useSchedule(Schedule schedule) {
    	// 객체를 매개변수로 받아 사용
    	// use schedule...
    	Schedule schedule2014 = schedule.getScheduleByYear(2014);
	}
}




