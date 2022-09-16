import java.util.ArrayList;
import java.util.Collection;

import javafx.util.Pair;

class PriorityQueue {
    ArrayList<Pair<Integer,String>> collection;
    int front;
    int rear;
    PriorityQueue() {
        collection = new ArrayList<>();
        front = -1;
        rear = -1;
    }
    void add (Pair<Integer, String> value)
    {
        // checking if pair is empty
        if (rear == -1)
        {
            front = 0;
            rear = 0;
            collection.add(value);
        }
        else
        {
            int i;
            for(i=0;i<collection.size();i++){
                if(value.getKey() < collection.get(i).getKey())
                {
                    collection.add(i, value);
                    break;
                }
        }
        if(i == collection.size())
        {
            collection.add(value);
        }
        rear = collection.size() - 1;
    }
    }
    Pair<Integer,String> delete()
    {
        Pair<Integer, String> deletedValue;
        // Check if Queue is Empty
        if(front == -1)
        {
            deletedValue = new Pair<>(-1,"");
        }
        else
        {
            deletedValue = collection.remove(front);
            rear = collection.size()-1;
        }
        return deletedValue;
    }
    void display()
    {
        for(Pair<Integer, String> value : collection)
        {
            System.out.print(value.getValue()+" ");
        }
        System.out.println();
    }

 }
public class PriorityQueueImplementation
{
    public static void main(String[] args) {
        PriorityQueue myCollection = new PriorityQueue();
        myCollection.add(new Pair<>(3, "Ramesh"));
        myCollection.add(new Pair<>(1, "Sita"));
        myCollection.display();
        myCollection.add(new Pair<>(2, "Gaurav"));
        myCollection.add(new Pair<>(4, "Rahul"));
        myCollection.display();
        System.out.println("Deleted Value"+myCollection.delete());
        System.out.println("Deleted Value"+myCollection.delete());
        myCollection.display();
        System.out.println("Deleted Value"+myCollection.delete());
        myCollection.display();
        myCollection.add(new Pair<>(1, "Vishal"));
        myCollection.add(new Pair<>(10, "Vikki"));
        myCollection.display();
    }
}



