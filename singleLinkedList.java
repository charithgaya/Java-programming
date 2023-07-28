class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
}

class SingleLinkedList{
	Node head = null ;
	Node tail = null ;
	
	void addNode(int data){
		Node node = new Node(data);
		if(head == null){
			head = node ;
			tail = node ;
		}else{
			 tail.next = node;
			 tail = node;
		}
	}
	void showTheList(){
		Node current = head;
		if(current == null){
			System.out.println("List is empty");
		}else{
			while(current != null){
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
		
	}
	
	void insertEmpty(int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			tail = node;
		}
	}
	
	void insertEnd(int data){
		Node node = new Node(data);
		if(head == null){
			head = node ;
			tail = node ;
		}else{
			 tail.next = node;
			 tail = node;
		}
	}
	void insertPoss(int data, int poss){
		Node node = new Node(data);
		if(head == null){
			head = node ;
			tail = node;
		}else{
			Node current = head;
			for(int i = 0; i<poss-1; i++){
				current = current.next;
			}
			node.next = current.next;
			current.next = node;
		}
	}
	void insertBegin(int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			tail = node;
		}else{
			node.next = head;
			head = node;
		}
	}
	void deleteEmpty(){
		if(head == null){
			System.out.println("list is already empty");
		}
	}
	void deleteBegin(){
		if(head == null){
			System.out.println("list is already empty");
		}else{
			head.next = head;
		}
	}
	void deleteEnd(){
		if(head == null){
			System.out.println("list is already empty");
		}else{
			Node current = head;
			Node prev = head;
			while(current.next != null){
				prev = current;
				current = current.next;
			}
			tail = prev;
			tail.next = null;
		}
	}
	void deletePoss(int poss){
		if(head == null){
			System.out.println("list is already empty");
		}else{
			Node current = head;
			Node prev = head;
			for(int i = 1; i<poss; i++){
				prev = current;
				current = current.next;
			}
			prev.next = current.next;
		}
	}
	void search(int val){
		if(head == null){
			System.out.println("list is already empty");
		}else{
			Node current = head;
			int index = 1;
			boolean avail = false;
			while(current.next != null){
				current = current.next;
				index++;
				if(current.data == val){
					avail = true;
					break;
				}
			}
			if (avail){
				System.out.println(val+" is available in the "+index+" position");
			}else{
				System.out.println(val+" is not available in the list");
			}
		}
	}
}

class main{
	public static void main(String args[]){
		SingleLinkedList list = new SingleLinkedList();
		
		list.addNode(5);
		list.addNode(12);
		list.addNode(4);
		list.addNode(6);
		list.addNode(9);
		list.insertEnd(23);
		list.insertBegin(00);
		list.insertPoss(42,3);
		
		
		list.showTheList();
		
	}
}