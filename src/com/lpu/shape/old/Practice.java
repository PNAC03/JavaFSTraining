public class Practice{0
    public static void main(String[] args){
        Practice ex = new Practice();
        ex.finalize();
        ex = null;
        System.gc();
        System.out.println("Inside the main() method");
    }
    protected void finalize(){
        System.out.println("object is destroyed by the destructor");
    }
}
