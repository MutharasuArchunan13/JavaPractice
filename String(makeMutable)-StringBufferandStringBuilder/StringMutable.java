public class StringMutable
{
    public static void main(String arg[])
    {
        /*
         * String-> sequence of characters i known as String.
         *          String is immutable why once you create a object to assign values then concat the previous value to new value.
         *          then the behind the is the string is create new object then put the concat values. The object taken by garbage collector only it not be used.
         * disadvantage:
         *      It is not efficient to memory management 
         * 
         * so solve this problem we have solution is StringBuffer and StringBuilder
         * both contain same method but samll diffrences are:
         *      
         *     StringBuffer                                              StringBuilder
         * -> It hava ThreadSafe                               -> It doesn't have ThreadSafe
         * -> All methods are synchroninzed                    -> no gurantee for methods are synchroninzed
         */

         //StringBuffer
         StringBuffer name = new StringBuffer();
         //use append mehtod to add values at the end
         // How to we know name ll'be only used one object? use hashcodes
         System.out.println("objectIsEmpty:"+name.hashCode());
         name.append("Muthu");
        System.out.println("AddFirstObject;"+name.hashCode());
        name.append("Kumar");
        System.out.println("AddSecondObject:"+name.hashCode());
        System.out.println("Result of concat:"+name);
        /*
         * O/P:
         *      objectIsEmpty:798154996
                AddFirstObject;798154996
                AddSecondObject:798154996
                Result of concat:MuthuKumar
         */
        //it have reverse() also
        System.out.println(name.reverse());

        // String builder aslo same but behind the seen it doesn't have thread safe

        StringBuilder name2 = new StringBuilder();
         //use append mehtod to add values at the end
         // How to we know name ll'be only used one object? use hashcodes
         System.out.println("objectIsEmpty:"+name2.hashCode());
         name2.append("Muthu");
        System.out.println("AddFirstObject;"+name2.hashCode());
        name2.append("Kumar");
        System.out.println("AddSecondObject:"+name2.hashCode());
        System.out.println("Result of concat:"+name2);

        System.out.println(name2.reverse());
        }
}