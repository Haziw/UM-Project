//data type cipta sendiri(student) dengan buat class baru. Class baru boleh dalam main class atau class berasigan
//enhance for loop
import java.util.Scanner;
class student//student jadi data type
{
   String name;//instance variable. kalau variable kat dalam method dipanggil local variable
   int age;
   int height;
}

public class Arrayobject
{
   public static void main(String[]args)
   {
      student s1 = new student();//object yang disimpan di heap
      s1.name="Haziq";//inti dalam object
      s1.age=19;
      s1.height=174;
      
      student s2 = new student();
      s2.name="Abu";
      s2.age=20;
      s2.height=169;
      
      student s3 = new student();
      s3.name="Adam";
      s3.age=50;
      s3.height=160;

      student [] Stu=new student[3];
      Stu[0]=s1;
      Stu[1]=s2;
      Stu[2]=s3;
      
      int maxheight = Stu[0].height;
      String heightname = Stu[0].name;
      
      /*for(int i=0;i<Stu.length;i++)
      {
         System.out.println(Stu[i].name+" "+Stu[i].age+" tahun.");
         if(Stu[i].height>maxheight)
         {
            heightname=Stu[i].name;
            maxheight=Stu[i].height;
         }
      }*/
      for(student Stude : Stu)
      {
         System.out.println(Stude.name+" "+Stude.age+" tahun.");
      }
      
      System.out.print(heightname+" is the highest with "+maxheight+" length.");
   }
}

