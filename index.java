abstract class Film
{
    public abstract void filmName();
    public abstract void filmDirector();
}
/**
 * index
 */
public class index {

    public static void main(String[] args) {
        Film object = new Film() 
        {
          public void filmName(){
            System.out.println("Click Click Bang");
          }  
          public void filmDirector(){
            System.out.println("Philip Karanja");
          }
        };
        object.filmName();
        object.filmDirector();

    }
}