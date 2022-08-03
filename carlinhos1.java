
/**
 * Escreva a descrição da classe carlinhos1 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.*;
public class carlinhos1
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
       
        String tabuada[][]={{"1x1=1","1x2=2","1x3=3","1x4=4","1x5=5","1x6=6","1x7=7","1x8=8","1x9=9","1x10=10",
           "2x1=2","2x2=4","2x3=6","2x4=8","2x5=10","2x6=12","2x7=14","2x8=16","2x9=18","2x10=20",
           "3x1=3","3x2=6","3x3=9","3x4=12","3x5=15","3x6=18","3x7=21","3x8=24","3x9=27","3x10=30",
           "4x1=4","4x2=8","4x3=12","4x4=16","4x5=20","4x6=24","4x7=28","4x8=32","4x9=36","4x10=40",
           "5x1=5","5x2=10","5x3=15","5x4=20","5x5=25","5x6=30","5x7=35","5x8=40","5x9=45","5x10=50",
           "6x1=6","6x2=12","6x3=18","6x4=24","6x5=30","6x6=36","6x7=42","6x8=48","6x9=54","6x10=60",
           "7x1=7","7x2=14","7x3=21","7x4=28","7x5=35","7x6=42","7x7=49","7x8=56","7x9=63","7x10=70",
           "8x1=8","8x2=16","8x3=24","8x4=32","8x5=40","8x6=48","8x7=56","8x8=64","8x9=72","8x10=80",
           "9x1=9","9x2=18","9x3=27","9x4=36","9x5=45","9x6=54","9x7=63","9x8=72","9x9=81","9x10=90",
           "10x1=10","10x2=20","10x3=30","10x4=40","10x5=50","10x6=60","10x7=70","10x8=80","10x9=90","10x10=100"}};
           
        char x;
        int resposta1;
        int contcertas=0;
        int conterradas=0;
        int tabEsc;
        do{
            do{
                System.out.println("Qual é a tabuada que queres aprender(1 a 10)?");
                tabEsc=input.nextInt();
            }while(tabEsc<0||tabEsc>10);
            
            int ranNum1 = (int)(Math.random()*9+1);
            System.out.println("Quanto é"+tabEsc+"x"+ranNum1+"?");
            resposta1=input.nextInt();
            if(tabEsc*ranNum1==resposta1){
                System.out.println("Boa Queres jogar outra vez ? (S/N)");
                contcertas++;
                x=input.next().charAt(0);
            }else{
                System.out.println("Opss, tenta outra vez a tabuada do"+ tabEsc+"!");
                conterradas++;
                for(int i=0;i<tabuada.length;i++){
                    System.out.println(tabuada[tabEsc-1][i]);
                }
                System.out.println("Queres jogar outra vez? (S/N)");
                x=input.next().charAt(0);
            }
        }while(x =='s');
        System.out.println("Respostas Certas:"+contcertas);
        System.out.println("Respostas Erradas:"+conterradas);
        System.out.println("A percentagem de acerto é:"+(contcertas*100)/(contcertas+conterradas)+"%");
    }
}
           
           
           
           
           
            
    

