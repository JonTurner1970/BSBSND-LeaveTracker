package turner;
import java.util.Date;

/**
 * @author Jonathan Turner
 * Represents a Leave Request. 
 */
public class LeaveRequest 
{
	public String emplid;
	public int LeaveID;   // identifier unique within a given employee.
	public Date beginDate;
	public Date endDate;
	public int  state;  //approved,denied, etc.
	public String comments;
}
