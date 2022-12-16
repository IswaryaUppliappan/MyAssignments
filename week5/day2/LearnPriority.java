package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnPriority {

	@Test(priority = -1)
	public void CreateLead() {
		System.out.println("CreateLead");

	}
	@Test(enabled = true)
	public void EditLead() {
		System.out.println("EditLead");

	}
	@Test(enabled = false)
	public void DuplicateLead() {
		System.out.println("DuplicateLead");
	}
	@Test
	@Ignore
	public void DeleteLead() {
		System.out.println("DeleteLead");
	}
	@Test(priority = 2)
	public void MergeLead() {
		System.out.println("MergeLead");

	}

}
