import java.util.ArrayList;

public class Cat {
    Integer id;
    String catName;
    String breed;
    String adress;

    public Cat(Integer id, String catName, String breed, String adress){
        this.id = id;
        this.catName = catName;
        this.breed = breed;
        this.adress = adress;
    }

    public void sayMeow() {
        System.out.println(this.catName +" cказал Мяу!");
    }

    public void Jump() {
        System.out.println(this.catName +" прыгнул");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%d, %s, %s, %s",id, catName, breed, adress);
    }
}
