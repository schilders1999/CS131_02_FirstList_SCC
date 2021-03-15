import java.util.Arrays;

//FirstList.java

/*** The FirstList class implements a generic array.
*@author  Nathan Johnson
*@version  1.0
*@since  2021-03-07
*/

public class FirstList<T>
{

    private final int DEFAULT_SIZE=10;
    private int currentItem=0;
    private T arList[];
    @SuppressWarnings("unchecked")
    public FirstList()
    {
        arList=(T[]) new Object[DEFAULT_SIZE];
        
    }
    
    @SuppressWarnings("unchecked")
    public FirstList(int length)
    {
        arList=(T[]) new Object[length];
    
    }
    
    public void addItem(T nextItem)
    {
        arList[currentItem] = nextItem;
        currentItem++;
    
    }
    
    public int getItemPosition() 
    {
    	return currentItem;
    }
    
    public void setItemPosition(int step)
    {
    	currentItem=step;
    }
    
    public T getItem()
    {
    	return arList[currentItem];
    	
    }

	@Override
	public String toString() {
		return "FirstList [DEFAULT_SIZE=" + DEFAULT_SIZE + ", currentItem=" + currentItem + ", arList="
				+ Arrays.toString(arList) + "]";
	}
    
    
}
    