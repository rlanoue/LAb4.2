
public class EquipmentTest {
	    // TODO: test full constructor, getters, and toString
	
	    public void fullConstructor() throws AssertException
	    {
	    	Equipment equipmentInfo = new Equipment("Umbrella/314,4.7,92.67,Shields from natural liquid falling from the sky"); 
	    	
	    	Assert.assertEquals("Umbrella", equipmentInfo.getName()); 
	    	Assert.assertEquals(314, equipmentInfo.getCount());
	    	Assert.assertEquals(4.7, equipmentInfo.getTotalWeight());
	    	Assert.assertEquals(92.67, equipmentInfo.getTotalPrice());
	    	Assert.assertEquals("Shields from natural liquid falling from the sky", equipmentInfo.getDescription());
	    	
	    }
	    
	      
	     public void toStringTest() throws AssertException
	     {
	    	Equipment equipmentLog = new Equipment("Umbrella/314,4.7,92.67,Shields from natural liquid falling from the sky");
	    	
	    	String expectedFormat =  "Name: Umbrella, Number: 314, Weight: 4.7lbs, Price: $92.67 - Shields from natural liquid falling from the sky"; 
	    	//"%s, a %s-colored animal. %.1f pounds, %.1f inches\n
	    	
	    	Assert.assertEquals(expectedFormat, equipmentLog.toString()); 
	     }
	     
	     
	}

