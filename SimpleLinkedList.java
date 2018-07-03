public class SimpleLinkedList{

//如何将函数参数设置为泛型的


	public static class Node{
		public Node prev;
		public Node next;
		public int value;
		public Node(int v){
			value = v;
		}
	}

	public Node head;
	public Node tail;

	public SimpleLinkedList(){
		
	}

	public Node init(int []arr){
		for(int t : arr){
			Node n = new Node(t);
			if(head == null){
				head = n;
				tail = n;
			}else{
				n.prev = tail;
				tail.next = n;
				tail = n;
			}
		}
		return head;
	}


	public void display(){
		Node n = head;
		while(n != null){
			System.out.println(n.value);
			n = n.next;
		}
		System.out.println("++++++++++++++++");

		Node p = tail;
		while(p != null){
			System.out.println(p.value);
			p = p.prev;
		}
	}

	public static void main(String[] args){
		SimpleLinkedList s = new SimpleLinkedList();

		int []arr = {1,2,3,4,5,6,7,8,9};
		s.init(arr);

		s.display();
	}
}
