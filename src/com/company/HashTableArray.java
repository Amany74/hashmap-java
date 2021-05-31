package com.company;


import java.util.Map;

public class HashTableArray< T>{
    Entry[] arrayHash;
    int Size;

    public HashTableArray(int Size)
    {
        this.Size=Size;
        arrayHash = new Map.Entry[this.Size];

        for(int i=0 ; i < arrayHash.length ; i++)
        {
            arrayHash[i] = new Map.Entry<T>();
        }
    }

    int GetHash(int key)
    {
        return key%Size;

    }
    public void put(int key , T value)
    {
        int index = GetHash(key);
        Entry ArrayValue =  arrayHash[index];
        Entry newItem = new Entry <T> (key , value);
        newItem.next = ArrayValue.next;
        ArrayValue.next = newItem;
    }

    public T get(int key)
    {
        T value = null;
        int index = GetHash(key);
        Entry ArrayValue = arrayHash[index];
        while(ArrayValue != null) {
            if (ArrayValue.Getkey() == key) {
                value = (T) ArrayValue.Getvalue();
                break;
            }

            ArrayValue = ArrayValue.next;
        }
        return value ;
    }
    int count=0;
    public  int Size(HashTableArray h)
    {
        for(int i=0 ; i<arrayHash.length;i++)
        {
            count++;
        }
        return count;
    }
}
