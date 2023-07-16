package HomeWork.HW06;

public class Cat {
    String name;
    String color;
    int age;
    int weight;

    /**
     * 
     * @param name
     * @param age
     */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void SayMeou(){
        System.out.printf("Кот %s сказал Мяуу.у!\n", name);
    }
    public void Jump(){
        System.out.printf("Кот %s сделал прыжок!\n", name);
    }

    public void FeedTheCat(int n){
        weight += n;
        System.out.printf("Кот %s поел и стал весить %d.\n", name, weight);
    }


}
