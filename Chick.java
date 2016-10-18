class Chick extends Cow
{    
     private String myType;
     private String mySound;
     public Chick(String type, String sound, String sound2){
     	myType = type;
          if(Math.random()*1>0.5){
     	    mySound = sound;
          }
          else{
               mySound = sound2;
          }
     }
     public String getSound(){
     	return mySound;
     }
     public String getType(){
     	return myType;
     }
}
