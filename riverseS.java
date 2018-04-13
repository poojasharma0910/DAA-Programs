import java.util.Stack;
class reverseS{

        int size;
        int top;
        char[] a;
        boolean isEmpty(){
            return (top <0);
    }
    reverseS(int n){
            top=-1;
            size=n;
            a=new char[size];
    }
    boolean push(char x){
        if(top>=size){
            System.out.println("stack overflow");
            return false;
        }else{
            a[++top]=x;
            return true;
        }
    }
    char pop(){
        if(top<0){
            System.out.println("stack underflow");
            return 0;
        }else{
            char x=a[top--];
            return x;
        }
    }
    public static void reverse(StringBuffer str)
    {
        int n = str.length();
        reverseS obj = new reverseS(n);


        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        for (i = 0; i < n; i++)
        {
            char ch = obj.pop();
            str.setCharAt(i,ch);
        }
    }

    public static void main(String[]args){
        StringBuffer x=new StringBuffer("geeksforgeeks");
        reverse(x);
        System.out.println(x);



    }
}
