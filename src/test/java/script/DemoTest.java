package script;

import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;

public class DemoTest extends BaseTest {

	@Test
	public void testA() {
		Reporter.log(driver.getTitle(), true);

		int rc = Excel.getRowCount("./data/actiTIME.xlsx", "login");
		Reporter.log("RC:" + rc, true);

		int cc = Excel.getColumnCount("./data/actiTIME.xlsx", "login", 0);
		Reporter.log("CC:" + cc, true);

		String v = Excel.getCellValue("./data/actiTIME.xlsx", "login", 0, 0);
		Reporter.log("value: " + v, true);

		Excel.setCellValue("./data/actiTIME.xlsx", "login", 0, 0, "Bhanu");
	}
}
