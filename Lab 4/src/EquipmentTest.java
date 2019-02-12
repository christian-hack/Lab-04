/**
 * 
 * @author cphackelman
 * "name/count,totalWeight,totalPrice,description"
 */
public class EquipmentTest
{
	public void equipmentConstructorTest() throws AssertException
	{
		String coolioBro = "CoolioBro/0, 0.0, 0.0,unknown";
		Equipment test = new Equipment(coolioBro);
		
		String expected1 = "CoolioBro";
		int expected2 = 0;
		Double expected3 = 0.0;
		String expected4 = "unknown";
		
		String actual1 = test.getName();
		int actual2 = test.getCount();
		Double actual3 = test.getTotalPrice();
		String actual4 = test.getDescription();
		
		Assert.assertEquals(expected1, actual1);
		Assert.assertEquals(expected2, actual2);
		Assert.assertEquals(expected3, actual3);
		Assert.assertEquals(expected4, actual4);
	}
	public void equipmentToStringTest() throws AssertException
	{
		String coolioBro = "CoolioBro/0, 0.0, 0.0,unknown";
		Equipment test = new Equipment(coolioBro);
		
		String expected = "Name: CoolioBro, Number: 0, Weight: 0.00 lbs, Price: $0.00 - unknown";
		
		String actual = test.toString();
		
		Assert.assertEquals(expected, actual);
	}
	public void equipmentEqualsTest() throws AssertException
	{
		//create 2 strings similar to each other with one string to compare to for a false output value
		String coolioBro = "CoolioBro/0, 0.0, 0.0,unknown";
		String dk = "DonkeyKong/0, 0.0, 0.0,unknown";
		String dk2 = "DonkeyKong/0, 0.0, 0.0,unknown";
		
		Equipment test1 = new Equipment(coolioBro);
		Equipment test2 = new Equipment(dk);
		Equipment test3 = new Equipment(dk2);
		
		boolean expected1 = true;
		boolean expected2 = false;
		
		Assert.assertEquals(expected1, test2.equals(test3));
		Assert.assertEquals(expected2, test1.equals(test2));
	}
}