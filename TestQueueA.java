// Gary Parker
// Test for the Array Queue

public class TestQueueA {
    public static void main(String[] args){
	QueueA a = new QueueA();
	Node xNode = new Node("Jane", 1);
	Node yNode = new Node("Joe", 2);
	Node zNode = new Node("Jack", 3);
	Node kNode = new Node("Jill", 4);
	Node a1 = new Node("a",5);
	Node b = new Node("b",6);
	Node c = new Node("c",7);
	Node d = new Node("d",8);
	Node e = new Node("e",9);
	Node f = new Node("f",10);
	Node g = new Node("g",11);
	Node h = new Node("h",12);
	Node i1 = new Node("i",13);
	Node j = new Node("j",14);
	Node k = new Node("k",15);
	Node l = new Node("l",16);
	Node m = new Node("m",17);
	Node n = new Node("n",18);
	Node o = new Node("o",19);
	Node p = new Node("p",20);
	
	Node z = new Node("z",21);
	a.enqueue(xNode);
	a.enqueue(yNode);
	a.enqueue(zNode);
	a.enqueue(kNode);
	a.enqueue(a1);
	a.enqueue(b);
	a.enqueue(c);
	a.enqueue(d);
	a.enqueue(e);
	a.enqueue(f);
	a.enqueue(g);
	a.enqueue(h);
	a.enqueue(i1);
	a.enqueue(j);
	a.enqueue(k);
	a.enqueue(l);
	a.enqueue(m);
	a.enqueue(n);
	a.enqueue(o);
	a.enqueue(p);
	a.enqueue(z);
	a.printQueue();
	/*
	System.out.println();
	System.out.println(a.front().getKey());
	System.out.println();
	a.printQueue();
	System.out.println();
	System.out.println(a.dequeue().getKey());
	System.out.println();
	a.printQueue();
	System.out.println();
	System.out.println(a.isEmpty());
	while(!a.isEmpty()) {
	    System.out.println(a.dequeue().getKey());
	    System.out.println();
	}
    	a.printQueue();
	System.out.println(a.isEmpty());
	System.out.println();
	a.enqueue(xNode);
	a.enqueue(yNode);
	a.enqueue(zNode);
	for (int i = 0; i < 65; i++) {
	    a.enqueue(xNode);
	    a.enqueue(yNode);
	    a.enqueue(zNode);
	    a.dequeue();
	    a.dequeue();
	    a.dequeue();
	}
	a.printQueue();
	*/
    }
}

