package department;

public class TechDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Tech Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Complete coding of module 1";
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
	public String getTechStackInformation() {
		return "Core Java";
	}

}
