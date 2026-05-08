public class Ex01_ClassLamp {
	private boolean on;

	public void turnOn(){
		this.on = true;
	}
	public void turnOff(){
		this.on = false;
	}
	public String showState(){
		if(on){
			return "Lâmpada ligada";
		}
		else{
			return "Lâmpada desligada";
		}
	}
}
