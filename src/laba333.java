public class laba333 {
    public static void main(String[] args) {
        String napryamok="До низу";
        int poverh=2;
        if(poverh==2 && napryamok=="До верху"){
        poverh=3;}
        else if (poverh==2 && napryamok=="До низу") {
            poverh=1;
        }
        if(napryamok=="До низу") {
        System.out.println("Ви спустились на "+poverh+" поверх"); }
        else {
        System.out.println("Ви піднялись на "+poverh+" поверх"); }

    }
}