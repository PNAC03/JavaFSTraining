public class Sum {
    static int a, b;

    Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getSum(){
        return(a + b);
    }

    public static void main(String[] args) {
        Sum obj = new Sum(5, 8);
        System.out.println("Sum is " + obj.getSum());
    }
}