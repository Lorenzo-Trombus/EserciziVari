
public class NostraLL<T> {
	private T data;
	private NostraLL<T> next;
	
	void AddFirst(T info) {
		NostraLL<T> l = new NostraLL<T>();
		l.data= info;
		l.next = this;
		if(next== null) {
			//la lista è vuota
			next = l;
		} else {
			l.next=next;
			next=l;
		}
	}

}
