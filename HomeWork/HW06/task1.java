package HomeWork.HW06;
// Реализуйте класс Cat, включающий в себя от трех полей и от двух методов,
// определяющих базовый функционал класса(за основу можно взять наработки с семинара). 
// Создать два экземпляра класса Cat и вывести информацию о них на экран.
public class task1 {
    
    public static void main(String[] args) {
        
          Cat pushok = new Cat("Pushok", 5);
          System.out.println(pushok.name);
          System.out.println(pushok.age);

          pushok.Jump();
          pushok.SayMeou();

          Cat ryjik = new Cat("Ryjik", 2, 1);
          System.out.println(ryjik.name);
          System.out.println(ryjik.age);
          System.out.println(ryjik.weight);

          ryjik.FeedTheCat(1);
          
    }

}


