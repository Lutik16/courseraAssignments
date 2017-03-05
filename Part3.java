/**
 * Created by Lucy on 2/15/17.
 */
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb) {

        int firstOccur = stringb.indexOf(stringa);
        if(firstOccur>=0){
            int secondOccure = stringb.indexOf(stringa,firstOccur+1);
            if (secondOccure>=0){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public String lastPart(String stringa, String stringb){

        int firstOccur = stringb.indexOf(stringa);
        if (firstOccur <0) {
            return stringb;
        }
        else {
            int la = stringa.length();
            int lb =stringb.length();
            String rest = stringb.substring(firstOccur+la, lb);
            return rest;
        }

    }
    public void testTwoOccurrences(){
        String stringa = "en";
        String stringb = "conveniently";
        boolean x = twoOccurrences(stringa, stringb);
        System.out.println("String a is " + stringa);
        System.out.println("String b is " + stringb);
        System.out.println("String b contains string a more then once. " + "It is " + x);

        String lastPart = lastPart(stringa, stringb);
        System.out.println("The part of the string after "+ stringa + " in "+ stringb+ " is "+ lastPart);

        stringa = "by";
        stringb = "A story by Abby Long";
        x = twoOccurrences(stringa,stringb);
        System.out.println("String a is " + stringa);
        System.out.println("String b is " + stringb);
        System.out.println("String b contains string a more then once. " + "It is " + x);

        lastPart = lastPart(stringa, stringb);
        System.out.println("The part of the string after "+ stringa + " in "+ stringb+ " is "+ lastPart);

        stringa = "cat";
        stringb = "Helicopter";
        x = twoOccurrences(stringa,stringb);
        System.out.println("String a is " + stringa);
        System.out.println("String b is " + stringb);
        System.out.println("String b contains string a more then once. " + "It is " + x);

        lastPart = lastPart(stringa, stringb);
        System.out.println("The part of the string after "+ stringa + " in "+ stringb+ " is "+ lastPart);

        stringa = "ing";
        stringb = "Problem Solving";
        x = twoOccurrences(stringa,stringb);
        System.out.println("String a is " + stringa);
        System.out.println("String b is " + stringb);
        System.out.println("String b contains string a more then once. " + "It is " + x);

        lastPart = lastPart(stringa, stringb);
        System.out.println("The part of the string after "+ stringa + " in "+ stringb+ " is "+ lastPart);
    }
}

