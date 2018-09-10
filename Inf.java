import java.util.*;
public class Inf
{
        int Tuoi, ID;

        public void Ten(String Ten)
        {
                System.out.println("Ten cua ban la: "+Ten);
        }
        void Doi(int tuoi,int id)
        {
               Tuoi=tuoi;
               ID=id;
        }
        void gettuoi()
        {
                System.out.print("Tuoi cua ban la: "+Tuoi);
        }

    void getid()
    {
        System.out.print("ID cua ban la: "+ID);
    }
    public static void main(String[] args)
    {
       int tuoi, id;
       String ten;
       Scanner x=new Scanner(System.in);
       System.out.print("Moi nhap ten ban: ");
       ten=x.nextLine();
       System.out.print("Moi nhap tuoi ban: ");
       tuoi=x.nextInt();
       System.out.print("Moi nhap ID: ");
       id=x.nextInt();

       Inf y=new Inf();
       y.Doi(tuoi,id);
       y.Ten(ten);
       y.gettuoi();
       y.getid();


    }

}
