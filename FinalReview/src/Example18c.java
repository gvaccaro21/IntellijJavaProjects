/**
 * Created by Giuseppe on 5/10/2014.
 */
public class Example18c {
    public static void main(String[] args){
        for (int i = 6; i >= 1; i--){

            for (int j = 6; j > i; j--)
                System.out.print(" " + " ");

            for(int k = 1 ; k <= i; k++){
                System.out.print(" " + k);
            }

            System.out.println();
        }
    }
}
