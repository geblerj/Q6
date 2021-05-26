//Write a Java program to enqueue 10 items into a Queue data structure called Alpha and enqueue 5 items into another Queue data structure called Omega. Join the two queue data structures and print out your output after each operation.


import java.util.Queue;
import java.util.LinkedList;

class Main{
	
  public static void enqueue10(Queue<Integer> queue){
  	for(int i=0;i<10;i++){
  		queue.add(i);
  	}
  }
  
  public static void enqueue5(Queue<Integer> queue){
  	for(int i=10;i<15;i++){
  		queue.add(i);
  	}
  }
  
  public static Queue<Integer> joinQueues(Queue<Integer> longerQueue, Queue<Integer> shorterQueue){
  	for(int i=0;i<5;i++){
  		longerQueue.add(shorterQueue.poll());
  	}
  	return longerQueue;
  }
  
  public static void main(String[] args) {
    Queue<Integer> Alpha = new LinkedList<Integer>();
    Queue<Integer> Omega = new LinkedList<Integer>();
    enqueue10(Alpha);
    System.out.println("Alpha: " + Alpha);
    enqueue5(Omega);
    System.out.println("Omega: " + Omega);
    Queue<Integer> joinedQueues = joinQueues(Alpha, Omega);
    System.out.println("Combined: " + joinedQueues);
  }
  
}
