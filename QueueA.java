//Evan Lyons 4/2/24
//Program Two
//This class creates the functions for queue with an array. The queue data structure follows the rule that nodes can only be accessed first-in-first-out. 

public class QueueA
{
	private Node[] q = new Node[20];
	private int front = 0;
	private int n = 0; 
	
	public QueueA(){
	
	}
	
	public void enqueue(Node x){ 	//adds node to queue
		int end = (front+n)%20;
		q[end] = x;
		n++;
	}
	
	public Node dequeue(){	//deletes node 
		if(n!=0){
			int temp = front;
			front = (front + 1)%20;   //will return to start of array once it reaches the end
			n--;
			return q[temp];
			}
		else{
			return null;
		}
	}
	
	public Node front(){
		return q[front];
	}
	
	//printQueue method 
	public void printQueue(){
		int tail = (front + n) % 20;
        	//System.out.println(front);
        	//System.out.println(tail);
        	if (front < tail)
        	   for(int i = front; i < tail; i++){
        	       System.out.println(q[i].getKey());
        	       }
        	else {
        	   for(int i = front; i < 20; i++) 
        	       System.out.println(q[i].getKey());          
        	   for(int i = 0; i < tail; i++) 
        	       System.out.println(q[i].getKey());
        	}       
	}
	public boolean isEmpty(){
		return n==0;
	}
	
	
}
