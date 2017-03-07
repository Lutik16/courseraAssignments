
import edu.duke.*;
/**
 * Created by lucy on 07/03/17.
 */

public class Part4 {
    public void findYoutubeLink (){
        URLResource duke = new URLResource ("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String x: duke.words()){
           int index = x.indexOf("youtube.com");
           if (index>=0){
               int endOfLink = x.indexOf("\"", index);
               int startOfLink = x.lastIndexOf("\"", index);
               String link = x.substring(startOfLink, endOfLink+1);
               System.out.println(link);
           }
        }
    }
}
