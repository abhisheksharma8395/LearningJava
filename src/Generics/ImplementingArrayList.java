package Generics;

import java.util.Arrays;

public class ImplementingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.addAtIndex(11,2);
        System.out.println(list.toString());
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.addAtIndex(6,3);
        list.addAtIndex(16,3);
        list.addAtIndex(26,3);
        list.addAtIndex(36,3);
        list.addAtIndex(46,3);
        list.addAtIndex(56,3);
        list.addAtIndex(66,3);
        list.addAtIndex(76,3);
        list.addAtIndex(86,3);
        list.addAtIndex(96,3);
        list.addAtIndex(106,3);
        list.addAtIndex(116,3);
        list.removeValue(6);
        System.out.println(list.toString());
    }
}

class ArrayList<T> {
    private T[] arr;
    private int size;
    private int index = 0;

    //default Constructor for initializing the default size
    public ArrayList(){
        this(10);
    }

    //Parameterised Constructor for initializing the size
    public ArrayList(int capacity){
        this.size = capacity;
        this.arr = (T[]) new Object[this.size];
    }

    //copy Constructor
    public ArrayList(ArrayList<T> list){
        this.arr = Arrays.copyOf(list.arr, list.arr.length);
        this.size = list.size;
        this.index = list.index;
    }

    //Method for adding an element at the last of list
    public void add(T element){    //add at the end
        if(this.index == arr.length){
            this.size = arr.length*2;
            T[] newArr = (T[]) new Object[size];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[index++] = element;
    }

    //Method for adding an element at the specified index of a list
    public void addAtIndex(T element,int index){
        boolean flag = false;
        if((this.index) < index || index < 0){
            System.out.println("Index out of bounds");
            return;
        }
        if(this.index == this.size){                   //if the index reaches to arr.length than we have to increase the size of arr to add the value
            this.size = arr.length*2;
            T[] newArray = (T[])new Object[size];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            arr = newArray;
        }
        for (int i = this.index; i > index ; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        this.index++;
    }

    //Method for removing an element from a particular index with return value
    public T removeAtIndex(int index){
        if(index < 0 || index >= this.index){
            System.out.println("Index out of bounds");
            return null;
        }
        T temp = this.arr[index];
        for(int i = index;i < this.index-1; i++){
            this.arr[i] = this.arr[i+1];
        }
        this.arr[this.index-1] = null;
        this.index--;
        return temp;
    }

    //Method for removing an element from a particular index without any return value
    public void remove(int index){
        if(index < 0 || index >= this.index){
            System.out.println("Index out of bounds");
            return;
        }
        for(int i = index;i < this.index-1; i++){
            this.arr[i] = this.arr[i+1];
        }
        this.arr[this.index-1] = null;
        this.index--;
    }

    //Method for removing a particular element from the list
    public boolean removeValue(T element){
        boolean flag = false;
        for(int i = 0; i < this.index; i++){
            if(this.arr[i].equals(element)){
                remove(i);
                i--;
                flag = true;
            }
        }
        return flag;
    }

    //Method for getting the value at particular index
    public T get(int index){
        if(index < 0 || index >= this.index){
            System.err.println("Index out of bounds");
            return null;
        }
        return this.arr[index];
    }

    //Method for setting or replace the value
    public void set(int index, T element){
        if(index < 0 || index >= this.index){
            System.err.println("Index out of bounds");
            return;
        }
        arr[index] = element;
    }

    //Method to return Number of elements stored in the list
    public int size(){
        return this.index;
    }

    //Methods to return the capacity of arr
    public int capacity(){
        return this.size;
    }

    //Method for checking is list currently empty
    public boolean isEmpty(){
        return this.index == 0;
    }

    //Method for clearing the list
    public void clear(){
        this.arr = (T[]) new Object[10];
        this.index = 0;
        this.size = 10;
    }

    //Method for checking is a particular element is existing in a list or not
    public boolean contains(T element){
        for(int i = 0; i < this.index; i++){
            if(this.arr[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    //Method for checking first occurrence index of a particular element
    public int indexOf(T element){
        for(int i = 0; i < this.index; i++){
            if(this.arr[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    //Method for checking last occurrence index of a particular element
    public int lastIndexOf(T element){
        for(int i = this.index-1; i >= 0; i--){
            if(this.arr[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    //String representation of a list
    @Override
    public String toString(){
        if(this.index == 0) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.index; i++){
            sb.append(arr[i]);
            if(i != this.index-1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

}