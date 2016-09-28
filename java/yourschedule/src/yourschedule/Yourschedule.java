/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Schedule v1
 */
package yourschedule;
public class Yourschedule {
    public static void main(String[] args) {
        String class1="English III";
        String class2="Precalculus";
        String class3="Music Theory";
        String class4="Biotechnology";
        String class5="Principles of Technology I";
        String class6="Latin II";
        String class7="AP US History";
        String class8="Business Computer Infomation Systems";
        
        String[]classes={"English III","Precalculus","Music Theory","Biotechnology","Principles of Technology I","Latin II","AP US History","Business Computer Infomation Systems"};
        String[]teachers={"Ms. Lapan","Mrs. Gideon","The Other Mr. Davis","Ms. Palmer","Ms. Garcia","Mrs. Barnett","Mr. Johannessen","Mr. James"};
        String teacher1="Ms. Lapan";
        String teacher2="Mrs. Gideon";
        String teacher3="The Other Mr. Davis";
        String teacher4="Ms. Palmer";
        String teacher5="Ms. Garcia";
        String teacher6="Mrs. Barnett";
        String teacher7="Mr. Johannessen";
        String teacher8="Mr. James";
        //for(String x:classes,y:teachers){
        //    System.out.printf(x);
        //    System.out.printf(", ");
        //couldnt figure out, gave up
        System.out.println("+------------------------------------------------------------------+");
        System.out.printf("|%25s|%-40s| %n",teacher1,class1);
        System.out.printf("|%25s|%-40s| %n",teacher2,class2);
        System.out.printf("|%25s|%-40s| %n",teacher3,class3);
        System.out.printf("|%25s|%-40s| %n",teacher4,class4);
        System.out.printf("|%25s|%-40s| %n",teacher5,class5);
        System.out.printf("|%25s|%-40s| %n",teacher6,class6);
        System.out.printf("|%25s|%-40s| %n",teacher7,class7);
        System.out.printf("|%25s|%-40s| %n",teacher8,class8);
        System.out.println("+------------------------------------------------------------------+");
        }
        
    }
    
}
