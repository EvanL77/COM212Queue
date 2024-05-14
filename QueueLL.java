//Evan Lyons 4/2/24
//Program Two
//This class creates the functions for queue with an Linked List. The queue data structure follows the rule that nodes can only be accessed first-in-first-out. 

public class QueueLL
{
	private Node front = null;
	private Node tail = null;
	
	public QueueLL(){
	
	}
	
	public void enqueue(Node x){ 	//adds node to queue
		if(front==null){ //if queue is empty
			front = x;
			tail = x;
		}
		
		else{
			tail.setNext(x);
			tail = x;
		}
		
	}
	
	public Node dequeue(){ 		//deletes node
		if(front!=null){//if the queue is not empty
			Node temp = front;
			front=front.getNext();
			temp.setNext(null);
			return temp;
		}
		else
			return null;
	}
	
	public Node front(){
		return front;
	}
	
	// printQueue method for QueueLL
    	public void printQueue() {
        	Node temp = front;
        	while (temp != null) {
        	    System.out.println(temp.getKey());
        	    temp = temp.getNext();
        	}
    	}
    	
    	public boolean isEmpty(){
    		return front == null;
    	}

}
