package org.shapes;
public class Question3 {
    int l,b;
    public Question3(int x,int y){
        l=x;
        b=y;
    }
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}
