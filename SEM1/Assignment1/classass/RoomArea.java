package classass;
class Room{
	private float length;
	private float breadth;
	public Room() {
	length=0;
	breadth=0;
	}
	public Room(float l,float b){
		length=l;
		breadth=b;
	}
	
	

	public void setLength(float length) {
		this.length=length;
	}
	public void setBreadth(float breadth) {
		this.breadth=breadth;
	}
	public float getLength() {
		return this.length;
	}
	public float getBreadth() {
		return this.breadth;
	}
	public double getArea() {
		return this.length*this.breadth;
	}
}
public class RoomArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r=new Room(12,3);
		System.out.println("Length is: "+r.getLength());
		System.out.println("Breadth is: "+r.getBreadth());
		System.out.println("Area is: "+r.getArea());
	}

}
