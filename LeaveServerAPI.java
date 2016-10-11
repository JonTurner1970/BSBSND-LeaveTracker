package turner;

/**
 * @author Jonathan Turner
 * This class represents the businesss logic of the Leave Mgt system.
 *
 */
public class LeaveServerAPI {
	
	static LeavePersistence leavePersistence = new LeavePersistence();
	
	public LeaveRequest[]  get (String EmployeeID)
	{
		authenticate(EmployeeID);
		return leavePersistence.get(EmployeeID);
		
		
	}
	public boolean  put(String EmployeeID, LeaveRequest[] leaves)
	{
		authenticate(EmployeeID);
		return leavePersistence.put(EmployeeID, leaves);
		//error handling
	}
	
	public boolean  delete(String EmployeeID, LeaveRequest[] leaves)
	{
		authenticate(EmployeeID);
		return leavePersistence.delete(EmployeeID, leaves);
		//error handling		
	}
	
	public boolean  approve(String EmployeeID, LeaveRequest[] leaves)
	{
		authenticate(EmployeeID);
		return leavePersistence.approve(EmployeeID, leaves);
		//error handling		
			
	}
	
	private void authenticate(String EmployeeID)
	{}
	
	
	
	

}
