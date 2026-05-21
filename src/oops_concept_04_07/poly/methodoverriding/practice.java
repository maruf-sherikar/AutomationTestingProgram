package src.oops_concept_04_07.poly.methodoverriding;



        class Animal{
            void sound(){
                System.out.println("Animal Sound");
            }
        }

        class Dogg extends Animal{
            void sound(){
                System.out.println("Bark");
            }

         }

public class practice  {
    public static void main(String[] args) {

        Animal animal = new Dogg();
        animal.sound();
    }
}
