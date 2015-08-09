package com.cts;

//create blueprint for node
class Node<T>{
	private T data;
	private Node next;//self aggregation
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node insert(T data) {
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		
		Node head=this;
		while(head.next!=null){
			head=head.next;
		}
		head.next=temp;
		
		return this;
		
	}
	
	public Node remove(int index) {
		int count=0;
		
		Node head=this;
		Node prevnode=head,nextnode=head.next;
		
		while(count==index){
			prevnode=nextnode;nextnode=nextnode.next;
		}
		prevnode.next=nextnode.next;
		
		return nextnode;
		
	}
	
	public void showListData() {
		Node temp=this;
		do {
			System.out.println(temp.getData());
			temp=temp.getNext();
		} while (temp!=null);
	}
}

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//node1
		Node<Integer> n1= new Node<>();
		n1.setData(10);
		System.out.println(n1.getData()+" "+n1.getNext());
		
		n1.insert( 100);
		n1.insert( 200);
		n1.insert(300);
		n1.showListData();
		
		Node removed=n1.remove(1);
		
		System.out.println(removed.getData());
		
		n1.showListData();
	
	
	}

}
