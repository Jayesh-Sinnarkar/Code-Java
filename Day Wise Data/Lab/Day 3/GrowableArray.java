import java.util.Arrays;

public class GrowableArray {

	int top;
	int[] array;
	
	public GrowableArray(int size) {
		super();
		this.top = -1;
		this.array = new int[size];
	}
	
	public void insert(int value) {
		if(isFull()) {
			int[] tempArray = new int[array.length*2];
			for(int i=0;i<array.length;i++) {
				tempArray[i] = array[i];
			}
			array = tempArray;
			array[++top] = value;
		}
		else {
			array[++top] = value;
		}
	}

	public boolean isFull() {
		return top==array.length-1;
	}
	
	public void deleteByPosition(int position) {
		if(position < array.length-1) {
			array[top] = 0;
			top= top -1;
		}
		System.out.println("Please enter valid position < than size =" + (array.length-1));
	}

	@Override
	public String toString() {
		return "GrowableArray [array=" + Arrays.toString(array) + "]";
	}
	
	
	
	
	
	
	
	
	
}
