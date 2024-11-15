package btech;

public class student {
    String name;
    int roll,m1,m2,m3;
    public student(String n, int a,int x,int y,int z){
        name=n;
        roll=a;
        m1=x;
        m2=y;
        m3=z;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+name);
        System.out.println("marks: "+m1+" "+m2+" "+m3);
        System.out.println("Total marks:"+(m1+m2+m3));
        System.out.println("Percentage:"+(m1+m2+m3)/3+"%");
    }
}
