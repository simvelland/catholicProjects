public class Link {
    
    private int data;
    private Link next;

    public Link(int d) {

        data = d;
    }

    public void displayLink() {

        System.out.print(data + " ");
    }

    public Link getNext() {

        return next;
    }

    public void setNext(Link n) {

        next = n;
    }

    public int getData() {

        return data;
    }

    public void setData(int d) {

        data = d;
    }
}
