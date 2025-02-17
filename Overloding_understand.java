public class Overloding_understand {
    //overloding mean same class name but pass diffrent parameters
    //return type dose not matter.
    //parameter are main part.
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a,float b, float c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(10, 020));
        System.out.println(sum(22.3f, 22.1f, 30.5f));
    }
}
