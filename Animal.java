public void setup(){
	Cow c = new Cow("cow", "moo");
	System.out.println(c.getType()+ " goes "+ c.getSound());
}
interface Animal 
{    
	public String getSound();
	public String getType();
}  
class Cow 
{     
     private String myType;
     private String mySound;
     public Cow(String type, String sound){
     	myType = type;
     	mySound = sound;
     }
     public Cow(){
     	myType = "unknown";
     	mySound = "unknown";
     }
     public String getSound(){
     	return mySound;
     }
     public String getType(){
     	return myType;
     }
}