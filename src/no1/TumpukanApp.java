
package no1;
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan = new Tumpukan (6);
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        long nilai3=tumpukan.peek();
        System.out.println("nilai teratas ="+nilai3);
        System.out.println("nama saya adalah Bachtiar Dwi Rizqianthoro");
        System.out.println("nilai yang dihapus ="+nilai3);
        long nilai1=tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
     
    }
}
