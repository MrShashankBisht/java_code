package Jun1;


final class ClassA {
    public static final String name = "My_name";
    private ClassA(){

    }
    static ClassA getClassA() {
        return new ClassA();
    }
}