package com.java.logical;

public class AddTwoLinkedList {

	public static void main(String[] args) {
		AddTwoLinkedList list=new AddTwoLinkedList();
		Node n1=new Node(5);
		list.addToTheLast(n1);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		System.out.print( "First List :: ");
		list.printList(n1);
		//n1=null;
		Node n2=new Node(6);
		list.addToTheLast(n2);
		list.addToTheLast(new Node(3));
		list.addToTheLast(new Node(5));
		list.addToTheLast(new Node(9));
		System.out.print("Second List :: ");
		list.printList(n2);
		
		n1=reverseLinkedList(n1);
		n2=reverseLinkedList(n2);
		
		Node result=list.findSumOfNumbers(n1, n2);
		result=list.reverseLinkedList(result);
		System.out.print("Result :: ");
		list.printList(result);
		
	}

	private static Node head;
	private static class Node{
		private int value;
		private Node next;
		Node(int value){
			this.value=value;
		}
	}
	
	public void addToTheLast(Node node) {
		if(head==null) {
			head=node;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
				temp.next=node;
			}
		}
	}
	
	public void printList(Node printNode) {
		Node temp = printNode;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
 
	public static Node reverseLinkedList(Node node) {
		if (node == null || node.next == null) {
			return node;
		}
 
		Node remaining = reverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		return remaining;
	}
	
	public Node findSumOfNumbers(Node l1, Node l2) {
		int carry =0;
 
		Node newHead = null;
		Node tempNodeForIteration=null;
		int sum=0;
 
		int firstIter=0;
		while(l1!=null || l2!=null)
		{
			firstIter++;
			sum=carry;
			if(l1!=null)
			{
				sum=sum+l1.value;
				l1=l1.next;
			}
 
			if(l2!=null)
			{
				sum=sum+l2.value;
				l2=l2.next;
			}
 
 
			carry=sum/10;
			sum=sum%10;
			// Check if it first node for the result
			if(firstIter==1)
			{ 
				tempNodeForIteration = new Node(sum);
				newHead=tempNodeForIteration;
			}
			else
			{
				Node tempSumNode=new Node(sum);
				tempNodeForIteration.next=tempSumNode;
				tempNodeForIteration=tempNodeForIteration.next;
			}
 
		}
		if(carry!=0)
		{
			Node tempNode=new Node(carry);
			tempNodeForIteration.next=tempNode;
		}
		return newHead;
	}
}
