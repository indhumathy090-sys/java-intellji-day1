package day11;
class anim{
    String breed;
    void makesound(){
        System.out.println("Makes sound");
    }
    void isseelp(){
        System.out.println(" Sleeping");
    }
}
class dog extends anim{
    String dog,breed;
    dog(String dog ,String breed){
        this.dog=dog;
        this.breed=breed;
    }
    void makesound() {
        System.out.println(dog + " bow bow");
        System.out.println(breed + "breed");
    }
        void isseelp(){
            System.out.println(dog+ "Sleeping");
        }
    }
class cat extends anim{
    String cat;
    cat(String cat){
        this.cat=cat;
    }
    void makesound() {
        System.out.println(cat+"meow meow");
    }
        void isseelp(){
            System.out.println(cat+"Sleeping");
        }
    }
public class animals {
    public static void main(String args[]){
        anim a1=new anim();
        dog dog1=new dog("jack","labour");
        cat cat1=new cat("luna");
        dog1.makesound();
        dog1.isseelp();
        cat1.makesound();
        cat1.isseelp();
    }
}
