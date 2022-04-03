
package biodata;

public class Main {

    public static void main (String[] args){
        
        Biodata data = new Biodata();
        
         System.out.println("Full Name          :" +data.getFullName());
         System.out.println("Place Of Birth     :" +data.getPlaceOfBirth());
         System.out.println("Date Of Birth      :" +data.getDateOfBirth());
         System.out.println("Hobby              :" +data.getHobby());
         System.out.println("Favorite Food      :" +data.getFavoriteFood());
         System.out.println("Future Goal        :" +data.getFutureGoal());
        
        
    }
}
