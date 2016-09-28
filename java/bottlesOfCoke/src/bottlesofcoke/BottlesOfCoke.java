/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name BottlesOfCoke v1
 * @date Nov 5, 2015
 */
package bottlesofcoke;
public class BottlesOfCoke {
    public static void main(String[] args) throws InterruptedException {
        int bottlesofbarqs=99;
        while (bottlesofbarqs>0) {
            System.out.printf("%s bottles of barqs on the wall, ",bottlesofbarqs);
            Thread.sleep(2500);
            System.out.printf("%s bottles of barqs\n",bottlesofbarqs);
            Thread.sleep(1250);
            System.out.printf("Take one down, ");
            Thread.sleep(1250);
            System.out.printf("pass it around,\n");
            bottlesofbarqs-=1;
            Thread.sleep(1250);
            System.out.printf("%s bottles of barqs on the wall \n\n",bottlesofbarqs);
            Thread.sleep(2500);
        }
        System.out.printf("no more bottles of barqs on the wall, ");
        Thread.sleep(3000);
        System.out.printf("no more bottles of barqs\n");
        Thread.sleep(1500);
        System.out.printf("can't take one down, ");
        Thread.sleep(1500);
        System.out.printf("can't pass it around,\n");
        Thread.sleep(1500);
        System.out.printf("cause theres no more bottles of barqs on the wall \n\n");
        Thread.sleep(3000);
    }
}