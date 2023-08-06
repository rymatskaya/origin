package exception;

public class Main {
    public static void main(String[] args) {

        //Start.start();
        User user= new User();
        user.setId(112L);
    }
     static class User {
        long id;
        User referal = new User();

         public void setId(long id) {
             this.referal.id = id;
         }
     }
}
