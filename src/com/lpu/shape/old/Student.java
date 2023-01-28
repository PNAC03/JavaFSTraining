// public class Student {
//     String name;
//     int id;
    // Student(String name, int id){
    //     this.name = name;
    //     this.id = id;
    //     display();
    // }
    // void display(){
    //     System.out.println(name + " " + id);
    // }

    // public static void main(String[] args){
    //     Student st0 = new Student("Name0", 13378);
    //     Student st1 = new Student("Name1", 13379);
    //     Student st2 = new Student("Name2", 13374);
    //     Student st3 = new Student("Name3", 13373);
    // }   
}


// class Student{
//     String name = "Aditya";
//     int id;
//     void getName(){
//         System.out.println(name)
//     }

// public static void main(String[] args){
//     Student st = new Student();
//     System.out.println(st.getName() + " in the main" );
// }
// }



public class Student{
    
    String getName(String name){
        return name;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Name is "+ s1.getName("Aditya")); 
    }
}

    