public class Led
{
	private int red;
	private int green;
	private int blue;
	private int dimmer;

  public Led()
  {
	  this.red = 0;
	  this.green = 0;
	  this.blue = 0;
	  this.dimmer = 0;
  }
  public void resetColor()
  {
	  this.red = 0;
	  this.green = 0;
	  this.blue = 0;
  }
  public boolean setColor(String color)
  {
	  this.red = 0;
	  this.green = 0;
	  this.blue = 0;
	if(color.equals("red"))
	{
		this.red = 255;
		return true;
	}
	else if(color.equals("green"))
	{
		this.green = 255;
		return true;
	}
	else if(color.equals("blue"))
	{
		this.blue = 255;
		return true;
	}
	else 
	{
		return false;
	}
  }
  public void setDimmer(int percentage)
  {
	  this.dimmer = percentage;
  }
  @Override
  public String toString()
  {
	  return "Led{" + "red: " + red + ", green: " + green + ", blue: " + blue + ", dimmer:" + dimmer + "}";
  }
  public static void main (String[] args)
  {
	  Led led1 = new Led();
	  led1.setColor("green");
	  led1.setDimmer(34);
	  System.out.println(led1);
	  System.out.println("red: " + led1.red + ", blue: " + led1.blue + ", green: " + led1.green + ", value" + led1.dimmer);
	  
  }
}
