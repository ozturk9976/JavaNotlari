package com.mycompany.mavenproject4;
import com.sun.source.tree.WhileLoopTree;
import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class mavenproject4 {
    public static void main (String[] args ){
        
        //1 JAVADA DEĞİŞKEN TİPLERİ
        /*
        byte -> sayı,1byte
        short -> sayı,2byte
        int -> sayı,4byte
        long -> sayı,8byte
        float -> ondalıklı sayı,4byte
        double -> ondalıklı sayı,8byte
        char -> karakter,2byte
        boolean -> true ya da false,1byte
        ------------------------------------------------------------------------
        */
        
        /* 2
        int sayi1 = 5;
        int sayi2;
        sayi2 =41;
        short s =32;
        double d =3.14;
        ------------------------------------------------------------------------
        */
        
        /* 3
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz");
        
        double a = scan.nextDouble();
        
        System.out.println("a değişkeninin değeri : " + a);
        ------------------------------------------------------------------------
        */
        
        //ARİTMETİK OPERATÖRLER 
        /* 4       
        % = kalan bulma
        int x = 10;
        int y = 4;
        
        System.out.println("sonuç" + ((double)x/y));
        ------------------------------------------------------------------------
        */
        
        //ATAMA,ARTTIRMA VE AZALTMA OPERATÖRLERİ 5
        /* 
        int a =10;
        
        a=a+1;  //veya a+=3; veya a*=5 veya a++; veya a--; eğer --a; olursa azaltma işlemi bir 
                                                                        sonraki satırda gerçekleşir
        
        System.out.println("a nın değeri" + " "+ a);
        ------------------------------------------------------------------------
        */ 
        
        //KARŞILAŞTIRMA OPERATÖRLERİ
        //a==b  //a>b
        //a!=b  //a<b
        //a<=b  //a>=b
        /* 6
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Notunuzu girin");
        
        int note = scan.nextInt();
        
        if (note > 90) 
        {
            
            System.out.println("Dersten Geçtiniz.. Notunuz AA");
            
        }
        else if (note > 80)  //üstteki if sağlanmıyorsa else if e geçer
        {
            System.out.println("Dersten Geçtiniz.. Notunuz BA");
        }
        else
        {
            System.out.println("Dersten Kaldınız..");
        }
        ------------------------------------------------------------------------
        */
         //MANTIKSAL BAĞLAÇLAR VE KULLANICI ADI GİRİŞİ
         /*
         ! -> Not operatörü // true ise false a çevirir false ise true ya
         && -> And //
         || -> Or  //
         */
         /* 7
         String sys_kul_adı = "ozturkhamza";
         String parola = "12345";
         
         Scanner scan = new Scanner(System.in);
         System.out.println("Kullanıcı Adı");
         
         String kullanıcı_adı = scan.nextLine();
         System.out.println("Parola :");
         
         String kul_parola = scan.nextLine();
         
         if (!(sys_kul_adı.equals(kullanıcı_adı)) && !(parola.equals(kul_parola))) 
        {  //stringler == ile kıyaslanamaz
            System.out.println("Kullanıcı adı ve parola yanlış");
        }
        else if ((sys_kul_adı.equals(kullanıcı_adı)) && !(parola.equals(kul_parola)))
        {
             System.out.println("parola yanlış");
        }
        else if ((!(sys_kul_adı.equals(kullanıcı_adı)) && (parola.equals(kul_parola))))
        {
             System.out.println("Kullanıcı adı yanlış");
        }
        else
        {
            System.out.println("Giriş Başarılı");
        }
        -----------------------------------------------------------------------
        */
         
         //SWİTCH CASE YAPISI 8
         /* 
         Scanner scan = new Scanner(System.in);
         
         int sayi = scan.nextInt();
         
         switch (sayi) {
            case 1:
                System.out.println("bir");
                
                break;
            case 2:
                System.out.println("iki");
                
                break;
            case 3:
                System.out.println("üç");
                
                break;
            case 4:
                System.out.println("dört");
                
                break;
            default:
               
                System.out.println("geçersiz sayı");
             -------------------------------------------------------------------
                */
                
                
        
    
                //ATM ÖRNEĞİ
                /*
                Scanner scan = new Scanner(System.in);                
                int bakiye = 1000;
                int islem;
                
                                
                System.out.println("Bakiye görüntüle");
                System.out.println("Para yatırma");
                System.out.println("Para çekme");
                System.out.println("Sistemden çıkış");
                
                islem = scan.nextInt();
                
                switch (islem) {
            case 1:
                System.out.println("Bakiyeniz :" + bakiye + "tl dir" );
                break;
            case 2:
                System.out.println("Ne kadar yatıracaksınız?" );               
                int miktar = scan.nextInt();
                
                bakiye  += miktar;
                System.out.println("Bakiyeniz :" + bakiye + "tl dir");
                break;
            case 3:
                System.out.println("Ne kadar çekeceksiniz?" );               
                miktar = scan.nextInt();
                
                bakiye  -= miktar;
                System.out.println("Bakiyeniz :" + bakiye + "tl dir");
                break;
            case 4:                
                System.out.println("Sistemden çıkılıyor");
                            
            default:
                System.out.println("Geçersiz işlem!");
             -------------------------------------------------------------------
            */
    
             //WHILE DÖNGÜLERİ 9
             /* 
             int i = 0;
             
             while(i < 10){
             System.out.println("java");
             i++;
             }
             System.out.println("Döngü bitti" +" "+ i);
            
             
             Scanner scan = new Scanner(System.in);
             
             System.out.println("Sayıyı giriniz");
             
             int sayi = scan.nextInt();
             
             int faktoriyel =1;
             
             while (sayi >= 1) {
                 System.out.println("faktoriyel :" + faktoriyel + "sayi : " + sayi);
                 faktoriyel = faktoriyel *sayi; 
                 
                 
                 sayi--;
             }
             System.out.println("Faktoriyel : " + faktoriyel);
             -------------------------------------------------------------------
             */
               
             //Do-While döngüleri 10 
             //en az bir defa çalışır
             
             // Kullanıcının girdiği sayıların rakamlarının
             // toplam değerini ekrana yazdıran uyg
             /*
             Scanner scan = new Scanner(System.in);
             
             int sayi = scan.nextInt();
             int toplam =0;
             do {
             toplam += sayi %10;
             
             sayi = sayi / 10;
             
             System.out.println("Toplam = " + toplam + "sayi = " +sayi);
             }
             while (sayi>0);
             System.out.println("Toplam = " + toplam);
             -------------------------------------------------------------------
             */
             
             //For döngüleri 11
             
            
             /*
             for (int i = 0, j= 0; i < 10 || j<5; i++,j++) {
                 
            System.out.println("i = " + i +" "+ "j = " + j);
        }
        
             
             for (int i = 0; i < 10; i++) {
                 for (int j = 0; j < 10; j++) {
                     System.out.println("i = " + i + "j = " + j);
                     
                 }
            }
             -------------------------------------------------------------------
            */
             
             // Break ve continue 12
             
             // Break -> koşula bakmadan döngüyü sona erdirir
             
             // Continue -> Altındaki işlemleri yapmadan döngünün en başına gider
             /*
             while(true){
             Scanner scan = new Scanner(System.in);
             System.out.println("Karakter giriniz");
             String s;
             s = scan.nextLine();
             
             
             if(s.equals("q")){
                System.out.println("Sistemden çıkılıyor!");
                break;
              }
            System.out.println("Karakter : " + s);
            
          }
           
             
             int i = 0;
             
            while (i < 10) {            
                
                if (i == 4 || i ==7) {
                    i++;
                    continue; //buradan döngünün en başına döndü if i atladı
                }
                
            System.out.println("i : " + i);
            i++;

            
        }
             -------------------------------------------------------------------
            */
             
             // Metotlar(Fonksiyonlar) 13
             
             
           

     
             
             
                      
          }
        }
         