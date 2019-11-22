package ADD;

public class Add {
	private int object1;
	private int object2;
	private int sum ;
	
	public Add(int object1,int object2){
		this.object1 = object1;
		this.object2 = object2;
		this.sum = object1 + object2;
	}
	
	public void setObject1(int object1){
		this.object1 = object1;
	}
	
	public void setObject2(int object2){
		this.object2 = object2;
	}
	
	public int getSum(){
		return sum;
	}
}
