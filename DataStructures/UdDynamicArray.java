import java.util.Arrays;

public class UdDynamicArray 
{
 
    int size;
    int capacity = 10;
    Object array[];
    // To create constructor method, to create array deffault capacity as 10
    public UdDynamicArray()
    {
        this.array = new Object[capacity];
    }
    // To overload the constructor to receive the capacity from user
    public UdDynamicArray(int capacity)
    {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data)
    {
        // To check the size >= capacity it's true we can't add data so goto increase size of array
        if(size >= capacity)
        grow();

        array[size] = data;
        size++;
    }
    // To create add(index,data)
    public void add(int index,Object data)
    {
        // if we want move elements, first move last element of array next step until you reach your index
        if(size >= capacity)
        {
            grow();
        }
            for(int i = size; i > index; i-- )
            {
                array[i]=array[i-1];
            }
            array[index]=data;
            size++;
        
    }

    // to delete the element 
    public void delete(Object data)
    {
        for(int i = 0; i < size; i++)
        {
            if(array[i]== data)
            {
                for(int j = i; j < size - 1; j++)
                {
                    array[ j ]=array[j+1];
                }
                array[size-1]=null;
               size--;
            }
            if(size <=(int)(capacity/3))
            {
                shrink();
            }
        }
    }

    //To get the data
    public Object get(int index)
    {
        if(index <=size)
        return array[index];
        return "indexNotBound";
    } 
    // to check the object is availabel if available return index
public Object search(Object data)
{
  for(int i = 0; i < size; i++)
  {
    if(array[i]==data)
    return i;
  }
return "object not found";
}
    public void grow()
    {
        int newCapacity = (int) (capacity*2);
        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i < size;i++)
        {
            newArray[i]=array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public void shrink()
    {
        int newCapacity = (int) (capacity/2);
        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i < size;i++)
        {
            newArray[i]=array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public boolean isEmpty()
    {
        return size ==0;
    }
    @Override
    public String toString() 
    {
        // To create toString() to return data's of the array 
        String string ="";
        for(int i = 0;i < size;i++)
        {
           string += array[i]+",";

        } 
        if(string != "")
        {
            string ="["+string.substring(0,string.length()-1)+"]";
        }
        else
           string="[]";
        return string;
    }

}
