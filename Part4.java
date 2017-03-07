
import edu.duke.*;
/**
 * Created by lucy on 07/03/17.
 */

public class Part4 {
    public void readLines (){
        URLResource yt = new URLResource ("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String x: yt.words()){
            System.out.println(x);
        }
    }
}
