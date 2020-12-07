package com.orangehrmlive;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
	
	@BeforeGroups(groups="admin")
	public void beforeAdminGroup() 
	{
		System.out.println("Executing Admin Module");
	}
	
	
	@BeforeGroups(groups="leave")
	public void beforeLeaveGroup() 
	{
		System.out.println("Executing leave Module");
	}
  @Test(groups="admin")
  public void adminModule1()
  {
	  System.out.println("Admin Test1");
  }
  
  @Test(groups="admin")
  public void adminModule2()
  {
	  System.out.println("Admin Test2");
  }
  
  @Test(groups="leave")
  public void leaveModule1 ()
  {
	  System.out.println("leave test1");
  }
  
  @Test(groups="leave")
  public void leaveModule2()
  {
	  System.out.println("leave test2");
  }
  
}
