
/**
 * Write a description of class AnimalLintList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ANode
{
    Animal cargo;
    ANode next;
    
    //degault constructor
    public ANode(){
        this.cargo = new Animal();
        this.next = null;
    }
    public ANode(Animal c, ANode n){
        this.cargo = c;
        this.next = n;
    }
    
    public ANode(Animal c){
        this.cargo=c;
        this.next = null;
    }
    
    public String toString(){
        return this.cargo.toString();
    }
}