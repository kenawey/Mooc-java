/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class List <T> {
     private T[] values;
      private int fFIndex;


    public List() {
        this.values = (T[]) new Object[10];
        this.fFIndex=0;
    }
    
public void add(T value)
{
     if(this.fFIndex == this.values.length) {
        grow();
    }
this.values[this.fFIndex] = value;
        this.fFIndex++;
}
private void grow() {
    int newSize = this.values.length + this.values.length / 2;
    T[] newValues = (T[]) new Object[newSize];
    for (int i = 0; i < this.values.length; i++) {
        newValues[i] = this.values[i];
    }

    this.values = newValues;
}



  public boolean contains(T value) {
    return indexOfValue(value) >= 0;
}

public void remove(T value) {
    int indexOfValue = indexOfValue(value);
    if (indexOfValue < 0) {
        return; // not found
    }

    moveToTheLeft(indexOfValue);
    this.fFIndex--;
}
public  int indexOfValue(T value) {
    for (int i = 0; i < this.fFIndex; i++) {
        if (this.values[i].equals(value)) {
            return i;
        }
    }

    return -1;
}

private void moveToTheLeft(int fromIndex) {
    for (int i = fromIndex; i < this.fFIndex - 1; i++) {
        this.values[i] = this.values[i + 1];
    }
}

public T value(int index) {
    if (index < 0 || index >= this.fFIndex) {
        throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.fFIndex + "]");
    }

    return this.values[index];
}
public int size() {
    return this.fFIndex;
}
}
