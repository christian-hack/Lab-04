
public class ZooTest
//expandZoo, addAnimal, getTotalHeight, 
//getAverageWeight, getAverageOfColorWeight, getAnimalArray,
//getCapacity, toString
{
	public void zooConstructorTest() throws AssertException
	{
		Zoo okc = new Zoo(100);
		
		int expected = 100;
		
		Assert.assertEquals(expected, okc.getCapacity());
	}
	public void zooExpandZooTest() throws AssertException
	{
		Zoo okc = new Zoo(10);
		
		Animal lily = new Animal ("unknown", "unknown", 0.0, 0.0);
	
		for (int index = 1; index < 12; ++index)
		{
			okc.addAnimal(lily);
		}
		int expected = 20;
		
		Assert.assertEquals(expected, okc.getCapacity());
	}
	public void zooGetCapacityTest() throws AssertException
	{
		Zoo okc = new Zoo(10);
		
		int expected = 10;
		
		Assert.assertEquals(expected, okc.getCapacity());
	}
	public void zooGetTotalHeight() throws AssertException
	{
		Zoo okc = new Zoo(10);
		
		Animal lily = new Animal ("unknown", "Lily", 0.0, 5.0);
		
		for (int index = 1; index < okc.getCapacity(); ++index)
		{
			okc.addAnimal(lily);
		}
		Double expected = 45.0;
		
		Assert.assertEquals(expected, okc.getTotalHeight());
	}
	public void zooToStringTest() throws AssertException
	{
		Zoo okc = new Zoo(10);
		//Using the same animal to repeated in the array x5
		String expected = "These animals live in the zoo: \nLily, a brown-colored animal. 6.5 pounds, 5.0 inches\nLily, a brown-colored animal. 6.5 pounds, 5.0 inches\nLily, a brown-colored animal. 6.5 pounds, 5.0 inches\nLily, a brown-colored animal. 6.5 pounds, 5.0 inches\nLily, a brown-colored animal. 6.5 pounds, 5.0 inches\n";
		Animal lily = new Animal ("brown", "Lily", 6.5, 5.0);
		
		for (int index = 1; index < 6; ++index)
		{
			okc.addAnimal(lily);
		}
		Assert.assertEquals(expected, okc.toString());
	}
}