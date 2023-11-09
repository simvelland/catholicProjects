public class SortedLinkedList {

    private Link first;

    public SortedLinkedList() {

        first = null;
    }

    public void insert(int key) {

        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while (current != null && key > current.getData()) {

            previous = current;
            current = current.getNext();
        }

        if (previous == null) {
            first = newLink;
        } else {
            previous.setNext(newLink);
        }
        newLink.setNext(current);
    }

    public Link remove() {

        Link temp = first;
        first = first.getNext();
        return temp;
    }

    public void displayList() {

        Link current = first;
        
        while (current != null) {

            current.displayLink();
            current = current.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty() {

        return first==null;
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

    public Link getFirst() {

        return first;
    }
}
