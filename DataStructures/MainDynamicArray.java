public class MainDynamicArray 
{
    public static void main(String[] arg)
    {
        UdDynamicArray dynamicArray = new UdDynamicArray(5);

        dynamicArray.add(10);
        dynamicArray.add(40);
        dynamicArray.add(20);
        dynamicArray.add(402);
       
        dynamicArray.add(2, 25);

        dynamicArray.delete(40);
        dynamicArray.delete(10);
      
        System.out.println(dynamicArray.get(3));
        System.out.println(dynamicArray);

    }    
}
