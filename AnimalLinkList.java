
/**
 * Write a description of class AnimalLinkList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimalLinkList
{
    ANode head;
    int length;
    
    //must have this order to Object IO
    public AnimalLinkList(){
        this.head = null;
        this.length = 0;
    }
    
    public AnimalLinkList(ANode head, int lenght){
        this.head = head;
        this.length = lenght;
    }
    
    public String toString(){
        String out = "";
        for(ANode n= head;n!=null;n = n.next){
            out += n.cargo.toString()+"\n";
            //or n.toString();
        }
        
        return out;
    }
    
    public Animal removeFirst(){
        Animal temp = head.cargo;
        //make the head.next into head
        this.length--;
        return temp;
    }
    
    public ANode findNode(int i){
        ANode temp = this.head;
        for(int j=1; j<=i;j++){
            temp = temp.next;
        }
        return temp;
    }
    //set
    public void set(int i, Animal a){
        ANode temp = findNode(i);
        temp.cargo = a;
    }
    
    public ANode add(int i, Animal a){
        length = length + 1; 
        ANode temp = findNode(i);
        ANode node = new ANode(a);
        length = length + 1; 
        temp = node;
        return temp;
    }
    
    public void addLast(Animal a){
        ANode node = new ANode(a);
        node.next = null;
        length++; 
    }
    
    public static void main (String[] args){
        AnimalLinkList ll = new AnimalLinkList(new ANode(new Animal("Felion",(byte)4),null),-1);
        Animal a = new Animal("Bovine", (byte) 5);
        ll.head.next = new ANode(a);
        Animal b = new Animal("cat", (byte)4);
        ll.head.next.next = new ANode(b);
        
        ll.set(1,new Animal("Hi", (byte)3));
        ll.add(1,new Animal("Add",(byte)2));
        System.out.println(ll);
        
    }
}