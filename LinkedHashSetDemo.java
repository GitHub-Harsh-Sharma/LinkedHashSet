import java.util.*;
class LinkedHashSetDemo
{
    public static void main(String[] args) 
    {
//LinkedHasSet is a method in java util
        LinkedHashSet<String>linkedset=new LinkedHashSet<String>();
        linkedset.add("Rahul");
        linkedset.add("Rohan");
        linkedset.add("Tanuj");
        linkedset.add("Priya");
        linkedset.add("Priya");
        linkedset.add("Mohan");
        System.out.println("Size of LinkedHashSet ="+linkedset.size());
        System.out.println("Original LinkedHashSet:"+linkedset);
        System.out.println("Removing Tanuj from LinkedHashSet: "+linkedset.remove("Tanuj"));
//contains gives bollen value
        System.out.println("Checking if Priya is present= "+linkedset.contains("Priya"));
        System.out.println("Updated LinkedHashSet: ");
        Iterator it=linkedset.iterator();
        while(it.hasNext())
        {
            String s=(String)it.next();
            System.out.println(s);
        }
    }
}