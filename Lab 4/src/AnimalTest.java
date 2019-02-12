/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void animalEmptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    public void animalFullConstructorTest() throws AssertException
    {
    	String name = "Reggie";
    	String color = "red";
    	Double height = 10.5;
    	Double weight = 50.5;
    	
    	Animal reggie = new Animal(color, name, weight, height);
    	
    	String expected1 = "Reggie";
    	String actual1 = reggie.getName();
    	String expected2 = "red";
    	String actual2 = reggie.getColor();
    	Double expected01 = 10.5;
    	Double actual01 = reggie.getHeight();
    	Double expected02 = 50.5;
    	Double actual02 = reggie.getWeight();
    	
    	Assert.assertEquals(expected1, actual1);
    	Assert.assertEquals(expected2, actual2);
    	Assert.assertEquals(expected01, actual01);
    	Assert.assertEquals(expected02, actual02);
    	
    }
    public void animalToStringTest() throws AssertException
    {
    	String expected = "Reggie, a red-colored animal. 50.5 pounds, 10.5 inches\n";
    	String name = "Reggie";
    	String color = "red";
    	Double height = 10.5;
    	Double weight = 50.5;
    	
    	Animal reggie = new Animal(color, name, weight, height);
    	
    	Assert.assertEquals(expected, reggie.toString());
    }
    public void animalGetNameTest() throws AssertException
    {
    	String expected = "Reggie";
    	
    	Animal reggie = new Animal("unknown", "Reggie", 0.0, 0.0);
    	
    	Assert.assertEquals(expected, reggie.getName());
    }
    public void animalGetColorTest() throws AssertException
    {
    	String expected = "red";
    	
    	Animal reggie = new Animal ("red", "unknown", 0.0, 0.0);
    	
    	Assert.assertEquals(expected, reggie.getColor());
    }
    public void animalGetWeightTest() throws AssertException
    {
    	Double expected = 5.3;
    	
    	Animal reggie = new Animal ("unknown", "unknown", 5.3, 0.0);
    	
    	Assert.assertEquals(expected, reggie.getWeight());
    }
    public void animalGetHeightTest() throws AssertException
    {
    	Double expected = 4.5;
    	
    	Animal reggie = new Animal ("unknown", "unknown", 0.0, 4.5);
    	
    	Assert.assertEquals(expected, reggie.getHeight());
    }
    public void animalEqualsTest() throws AssertException
    {
    	Animal reggie = new Animal ("red", "Reggie", 60.5, 10.3);
    	
    	Animal tester = new Animal ("red", "Reggie", 60.5, 10.3);
    	
    	Animal lily = new Animal ("brown", "Lily", 20.2, 8.8);
    	
    	boolean expected = true;
    	boolean expected2 = false;
    	
    	Assert.assertEquals(expected, reggie.equals(tester));
    	Assert.assertEquals(expected2, reggie.equals(lily));
    	
    }
}

