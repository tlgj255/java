public class algorithm {
private int data;
private algorithm next;
public algorithm(int data){
	this.data = data;
}
public void setData(int data){
	this.data = data;
}
public int getData(){
	return data;
}
public void setNext(algorithm next){
	this.next = next;
}
public algorithm getNext(){
	return this.next;
}
int ListLength(algorithm headNode){
	int Length = 0;
	algorithm currentNode = headNode;
	while(currentNode != null){
		Length++;
		currentNode = currentNode.getNext();
	}
	return Length;
}
algorithm InsertInLinkedList(algorithm headNode, 
		algorithm nodeToInsert,int position){
	if(headNode == null)
		return nodeToInsert;
		int size = ListLength(headNode);
		if(position > size+1 || position < 1){
			System.out.println("Position of node to insert is invalid.\nThe valid inputs are 1 to "+(size +1));
			return headNode;
		}
		if(position == 1){
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		} else {
			algorithm previousNode = headNode;
			int count = 1;
			while(count < position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			algorithm currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
		}
		return headNode;
}
void DeleteLinkedList(algorithm head){
	algorithm auxilaryNode, iterator = head;
	while(iterator != null){
		auxilaryNode = iterator.getNext();
		iterator = null;
		iterator = auxilaryNode;
	}
}
}
