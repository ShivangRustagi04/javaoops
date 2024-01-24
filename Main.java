import java.util.Arrays;

class Main {
  public static void main(String[] args){
    System.out.println("Hello world!");


  
    int[] rno = new int[5];
    String[] Name = new String[5];
    float[] marks = new float[5];

    Student[] students = new Student[5];

    Student kunal = new Student();

    System.out.println(kunal.rno);
    
    System.out.println(kunal.Name);
    System.out.println(kunal.marks);



  }
    
}


class Student{
    int[] rno = new int[5];
    String[] Name = new String[5];
    float[] marks = new float[5];
}
