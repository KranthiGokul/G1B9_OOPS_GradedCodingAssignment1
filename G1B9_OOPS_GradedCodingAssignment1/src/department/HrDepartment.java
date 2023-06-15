package department;

public class HrDepartment extends SuperDepartment{

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Hr Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Fill today's timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}

	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return "Today is not a Holiday";
	}
	public void doActivity() {
		System.out.println("Team Lunch");
	}

}
