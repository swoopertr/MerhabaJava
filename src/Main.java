
public class Main {
    // accessor type fnName(prms)
    // static fn ler kendi aralarında
    // static olmayanlar kendi aralarında
    static boolean staticTrueFalse = false;

    public static void main(String[] args) {
//        int sayi = 1;
//        System.out.println("sayi = " + sayi);
//
//        float ondalikli = 1.1632763F;
//        System.out.println("ondalikli = " + ondalikli);
//
//        float topla = sayi + ondalikli;
//        System.out.println("topla="+ topla);
//
//        String text = "Ali";
//        System.out.println("text="+ text + ", topla="+topla);
//
//        System.out.println(String.valueOf(sayi + ondalikli));
//
//        int converted = Integer.valueOf("8888");
//
//        System.out.println("converted= " + converted);
//
//        boolean trueFalse = true;
//        System.out.println("trueFalse = " + trueFalse);
//
//        System.out.println("staticTrueFalse = " + staticTrueFalse);
//
//        if (trueFalse){
//            System.out.println("değerim true");
//        }else{
//            System.out.println("değerim false");
//        }
//
//        if (!trueFalse){
//            System.out.println("değerim true");
//        }else if(text == "ali"){
//            System.out.println("değerim false");
//        }else{
//            System.out.println("hiç birine girmedi");
//        }
//
//        switch (text){
//            case "ali":
//                System.out.println("ali seçildi");
//                break;
//            case "veli":
//                System.out.println("veli seçildi");
//                break;
//            default:
//                System.out.println("hiç biri seçilmedi");
//        }
//
//        int abs =  Math.abs(123);
//        System.out.println("abs = "+ abs);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i'nin değeri = "+ i);
//        }
//        int counter =0;
//
//        while (counter < 10){
//            System.out.println("counter'nin değeri = "+ counter);
//            counter +=3;
//            //counter++;
//        }
        System.out.println("fn1="+ fn1());
        int[] intArr = new int[5];
        System.out.println("intArr.length : " + intArr.length);
        System.out.println("intArr : " + intArr[0]);
        intArr[3] = 2;
        System.out.println("intArr : " + intArr[1]);

        for (int i = 0; i < intArr.length;  i++) {
            intArr[i] = i*2;
        }

        for (int i = 0; i < intArr.length;  i++) {
            System.out.println("intArr " + i + " index değeri: " + intArr[i]);
        }

        System.out.println("toplama işlemi : " + sum(3,4));

        System.out.println("toplama işlemi : " + sum(3,4,5));

        System.out.println("toplama işlemi : " + sum(3,4,5,6));
//
        System.out.println("toplama işlemi : " + sum(3.1F,4.5F));

    }



    private static int sum(int... prms){
        //todo: array sum
        System.out.println("prms.length : " + prms.length);
        int toplam = 0;
//        for (int i = 0; i < prms.length;  i++) {
//            toplam = toplam + prms[i];
//        }

        for (int prm : prms) {
            toplam = toplam + prm;
        }

        return toplam;
    }

    private static float sum(float... prms){
        //todo: array sum
        float toplam = 0;
//        for (int i = 0; i < prms.length;  i++) {
//            toplam = toplam + prms[i];
//        }

        for (float prm : prms) {
            toplam = toplam + prm;
        }

        return toplam;
    }

//    private static float sum(float x, float y){
//        return x+y;
//    }

    private static int fn1(){
        return  1;
    }

    public static String fnPubStatic(){
        return "Static fn den Selamlar";
    }

    //------------ static olmayan
    public int fn2(){
        String deneme = fnPubStatic();
        System.out.println("deneme="+deneme);
        return 2;
    }

    public int fn3(){
        int fn2result = fn2();
        sum(2,4);
        return 3;
    }



}

