package repl_it_part3;

public class TV {
	  int channel=1;
	  int volumeLevel=1;
	  boolean on=false;
	  String brand="undefined";
	  
	  TV(){
	    System.out.println("Creating TV object using no Args-constructor");
	  }
	  TV(String brand){
	    this.brand=brand;
	    System.out.println("Creating TV object using 1 arg-constructor");
	  }
	  public int getVolumeLevel(){
	    return volumeLevel;
	  }
	  public void setVolumeLevel(int volumeLevel){
	    if(volumeLevel>=1 && volumeLevel<=7 && on){
	    this.volumeLevel=volumeLevel;
	      }else{
	        System.out.println("TV is either OFF or invalid Volume level");
	      }
	  }
	  public int getChannel(){
	    return channel;
	  }
	  public void setChannel(int channel){
	    if(channel<=0 && channel>=120 && on){
	      System.out.println("TV is either OFF or invalid Channel");
	    }else{
	    this.channel=channel;}
	  }
	  public String getBrand(){
	    return brand;
	  }
	  public void setBrand(String brand){
	    this.brand=brand;
	  }
	  public int channelUp(){
	   return channel++;
	  }
	  public int channelDown(){
	   return channel--;
	  }
	  public boolean getOn(){
	    return on;
	  }
	  public boolean isOn(){
	    return on;
	  }
	  public int volumeUp(){
	   return volumeLevel++;
	  }
	  public int volumeDown(){
	    return volumeLevel--;
	  }
	  public void turnOn(){
	    if(on){
	      System.out.println("TV is already ON");
	    } else {
	      on = true;}
	  }
	  public void turnOff(){
	    if(!on){
	      System.out.println("TV is already OFF");
	    }else{
	      on =false;
	    }
	  }
	}