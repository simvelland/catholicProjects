public class LinkedList {
    
    public Link first;
    public Link last;

    public LinkedList() {

        first = null;
        last = null;
    }

    public boolean isEmpty() {

        return first==null;
    }

    public void insertLast(int d) {

        Link newLink = new Link(d);

        if (this.isEmpty()) {
            first = newLink;
        } else {
            last.setNext(newLink);
        }

        last = newLink;
    }

    public Link deleteFirst() {

        Link temp = first;

        if (first.getNext() == null) {
            last = null;
        }
        first = first.getNext();
        return temp;
    }

    public void displayList() {

        Link current = first;
        
        while (current != null) {

            current.displayLink();
            current = current.getNext();
        }
    }

    public int sumData() {

        Link current = first;
        int sum = 0;
        
        while (current != null) {

            sum += current.getData();
            current = current.getNext();
        }

        return sum;
    }
}
