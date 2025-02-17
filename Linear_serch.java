public class Linear_serch {
    public static int  linearserch(int number[], int key){
        for(int i = 0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int number [] ={2,4,6,8,10,11,41,16};
        int key =10;

        int index =linearserch(number, key);
        if(index==-1){
            System.out.println("index not found ");
        }else{
            System.out.println("key is index "+ index);
        }
    }
}
