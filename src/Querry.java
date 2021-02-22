public class Querry <V>{

    private Element head;

    private int size = 0;

    public void add(V data){

        if(head == null)
        {
            head = new Element(data);
        }
        else {

            Element temp = head;

            while(temp.next!=null) {

                temp = temp.next;
            }

            temp.next = new Element(data);
        }
        size++;
    }

    public int size(){

        return size;
    }

    private void decreaseSize(){
        if(size>0)
        {
            size--;
        }
        else
            {

                throw new IllegalStateException("Querry is already empty!");
            }
    }

    public V remove(){


        Element temp = head;
        if(head==null) {
            throw new IllegalStateException("Querry is already empty!");
        }
        head = head.next;

        decreaseSize();


        return temp.data;
    }

    private class Element
    {
        public Element (V data)
        {
            this.data = data;
        }

        //Next ELEMENT IN List
        public Element next = null;
        public V data;

    }
}
