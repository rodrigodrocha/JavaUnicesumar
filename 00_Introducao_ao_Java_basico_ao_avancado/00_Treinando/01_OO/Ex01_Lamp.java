public class Ex01_Lamp{
	public static void main(String[] args){

		Ex01_ClassLamp lampada = new Ex01_ClassLamp();
		
		lampada.turnOn();
		
		System.out.println(lampada.showState());
		
		lampada.turnOff();
		
		System.out.println(lampada.showState());
	}
}