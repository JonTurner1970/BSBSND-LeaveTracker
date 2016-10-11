package turner;

/**
 * @author Jonathan Turner
 *This class represents the starage/persistence piece  of the Leave Mgt system.
 */
public class LeavePersistence {
	
	public LeaveRequest[]  get (String EmployeeID)
	{
		return null;
		
	}
	public boolean put(String EmployeeID, LeaveRequest[] leaves)
	{
		return false;
		
	}
	
	public boolean delete(String EmployeeID, LeaveRequest[] leaves)
	{
		return false;
	}
	
	public boolean approve(String EmployeeID, LeaveRequest[] leaves)
	{
		return false;
		
	}	
	
	public String getLastError()
	{
		return "";
	}
	

}
