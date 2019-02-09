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
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animals = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animals.getColor());
        Assert.assertEquals("noname", animals.getName());
        Assert.assertEquals(0, animals.getHeight(), 0.01);
        Assert.assertEquals(0, animals.getWeight(), 0.01);
    }
    
    // TODO: test full constructor, getters, and toString
    public void fullConstructor() throws AssertException
    {
    	Animal testAnimal = new Animal("red", "Fred", 4.7, 18); 
    	
    	Assert.assertEquals("red", testAnimal.getColor()); 
    	Assert.assertEquals("Fred", testAnimal.getName());
    	Assert.assertEquals(4.7, testAnimal.getWeight(), 0.01);
    	Assert.assertEquals(18, testAnimal.getHeight(), 0.01);
    }
      
     public void toStringTest() throws AssertException
     {
    	Animal testAnimal2 = new Animal("sparkley", "Jameson", 17.3, 4.0);
    	
    	String expectedFormat = "Jameson, a sparkley-colored animal. 17.3 pounds, 4.0 inches\n";
    	
    	Assert.assertEquals(expectedFormat, testAnimal2.toString()); 
     }
}

