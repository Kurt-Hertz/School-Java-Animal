/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    private String species;
    private byte age;
    
    public Animal(){
        this.species = "TBD";
        this.age = (byte) -1;
    }
     
    public Animal(String s, byte age){
        this.species = s;
        this.age = age;
    }
    
    public Animal(String s){
        this.species = s;
        this.age = (byte) -1;
    }

    public String getSpecies(){
        return this.species;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setSpecies(String s){
        this.species = s;
    }
    
    public void setAge(byte a){
        this.age=a;
    }
    
    public String toString(){
        return this.species+" age: " + this.age;
    }
    
    public static void main (String[] args){
        Animal a = new Animal();
        System.out.println(a);
    }
}