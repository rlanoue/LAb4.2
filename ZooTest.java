
public class ZooTest {
	    /**
	     * Test the empty Animal constructor and the getters
	     */
	
 	Zoo zooCapactity = new Zoo(81);
 	Animal animal1 = new Animal("grey", "Ryan-Goosling", 365.0, 84); 
 		public void capacityTest() throws AssertException
 		{
 			 Assert.assertEquals(zooCapactity.getCapacity(), 81);
 		}
 	
 		public void getTotalHeight() throws AssertException
 		{
 			zooCapactity.addAnimal(animal1); 
 			Assert.assertEquals(zooCapactity.getTotalHeight(), 84, 0.01);
 		}
 	
	   public void toStringTest() throws AssertException
	     {  
	    	String expectedFormat = "Ryan-Goosling, a grey-colored animal. 365.0 pounds, 84.0 inches\n"; 
	    	
	    	Assert.assertEquals(expectedFormat, animal1.toString());
	     }
}