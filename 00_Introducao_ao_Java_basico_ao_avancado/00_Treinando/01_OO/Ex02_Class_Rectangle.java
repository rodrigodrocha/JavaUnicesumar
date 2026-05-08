class Ex02_Class_Rectangle{
	private final double width;
	private final double height;

	public Ex02_Class_Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public Ex02_Class_Rectangle(double width){
		this(width, width);
	}
	public double square(){
		return this.width * this.height;
	}
}