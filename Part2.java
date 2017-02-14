import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.messaging.saaj.util.SAAJUtil;

/**
 * Created by lucy on 2/14/17.
 */
public class Part2 {
    public String findSimpleGene (String dna, String startCodon, String stopCodon){

        String result="";

        int startIndex = dna.indexOf(startCodon);
        if(startIndex== -1){
            return "None";
        }

        int stopIndex = dna.indexOf(stopCodon, startIndex+3);
        if(stopIndex==-1){
            return "None";
        }
        result= dna.substring(startIndex,stopIndex+3);
        if(result.length()%3==0){
            return result;
        }
        if(result.length()%3>0){
            return "None";
        }
        if(result.length()%3<0){
            return "None";
        }
        return result;

    }

    public void testSimpleGene(){
        String dna = "AGTCTACGAAGTAATCG";
        System.out.println("DNA strand is "+ dna);
        String startCodon ="ATG";
        String stopCodon ="TAA";
        String gene = findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene is "+ gene);

        dna = "GATCATGAAGCATTCGCC";
        System.out.println("DNA strand is "+ dna);
        gene = findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene is "+ gene);

        dna = "TGTCATGCAATGCCGATAACTA";
        System.out.println("DNA strand is "+ dna);
        gene = findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene is "+ gene);

        dna = "CATATGTCGAATTGACTAAGACCTG";
        System.out.println("DNA strand is "+ dna);
        gene = findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene is "+ gene);

        dna = "AGTCTACGAAGTCAATC";
        System.out.println("DNA strand is "+ dna);
        gene = findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene is "+ gene);

        dna = "datcatgtccagttaacat";
        System.out.println("DNA strand is "+ dna);

        gene = findSimpleGene(dna.toUpperCase(), startCodon, stopCodon);
        System.out.println("Gene is "+ gene.toLowerCase());
    }
}

