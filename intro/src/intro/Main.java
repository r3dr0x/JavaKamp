package intro;

public class Main {

    public static void main(String[] args) {
        
    
        
        
        String internetSubeButonu = "�nternet �ubesi";
        
        double dolarDun = 8.15;
        double dolarBugun = 8.18;
        int vade=36;
        boolean dustuMu =false;
        
      
        
        System.out.println("hello world");
        System.out.println(internetSubeButonu);
        
        if(dolarBugun<dolarDun) {
            
            System.out.println("Dolar D��t� resmi <img src=''>");
            
        }else if(dolarBugun>dolarDun){
            
            System.out.println("Dolar Y�kseldi  resmi <img src=''>");
            
        }else {
            System.out.println("Dolar e�ittir resmi <img src=''>");
            
        }
        
        System.out.println("*********************************");
        
        String kredi1="HIzl� kredi";
        String kredi2 ="Mutlu emeklilik kredisi";
        String kredi3 ="Konut kredisi";
        String kredi4 ="Ciftci kredisi";
        String kredi5 = "msb kredisi";
        
        String [] krediler = {kredi1, kredi2, kredi3,kredi4,kredi5};
        
    
        //foreach => javadaki foreach demek
        for (String kredi : krediler) {
            System.out.println(kredi);
            
        }
        
    
        
       for (int i = 0; i < krediler.length; i++) {
          
          
        System.out.println(krediler[i]);
        
       }
      
        
        int sayi1= 10;
        int sayi2=20;
        sayi1 =sayi2;
        System.out.println(sayi1);
        
        int[] sayilar1= {1,2,3,4,5};
        int[] sayilar2 = {10,20,30,40,50};
        sayilar1 =sayilar2;
        sayilar2[0]=100;
        System.out.println(sayilar1[0]);

        String sehir1 ="Ankara";
        String sehir2="Istanbul";
        sehir1 = sehir2;
        sehir2 ="Izmir";
        System.out.println(sehir1);
        
    }}
