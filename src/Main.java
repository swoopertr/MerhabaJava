
public class Main {

    static boolean staticTrueFalse = false;

    public static void main(String[] args) {
        int sayi = 1;
        System.out.println("sayi = " + sayi);

        float ondalikli = 1.1632763F;
        System.out.println("ondalikli = " + ondalikli);

        float topla = sayi + ondalikli;
        System.out.println("topla="+ topla);

        String text = "Ali";
        System.out.println("text="+ text + ", topla="+topla);

        System.out.println(String.valueOf(sayi + ondalikli));

        int converted = Integer.valueOf("8888");

        System.out.println("converted= " + converted);

        boolean trueFalse = true;
        System.out.println("trueFalse = " + trueFalse);

        System.out.println("staticTrueFalse = " + staticTrueFalse);

        if (trueFalse){
            System.out.println("değerim true");
        }else{
            System.out.println("değerim false");
        }

        if (!trueFalse){
            System.out.println("değerim true");
        }else if(text == "ali"){
            System.out.println("değerim false");
        }else{
            System.out.println("hiç birine girmedi");
        }

        switch (text){
            case "ali":
                System.out.println("ali seçildi");
                break;
            case "veli":
                System.out.println("veli seçildi");
                break;
            default:
                System.out.println("hiç biri seçilmedi");
        }


        int abs =  Math.abs(123);
        System.out.println("abs = "+ abs);

        for (int i = 0; i < 10; i++) {
            System.out.println("i'nin değeri = "+ i);
        }
        int counter =0;

        while (counter < 10){
            System.out.println("counter'nin değeri = "+ counter);
            counter +=3;
            //counter++;
        }


    }

}