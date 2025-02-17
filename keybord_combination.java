public class keybord_combination {
    final static char[][] L = {
        {}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
        {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
        {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
    };
    public static void Lattercombination(String d){
        int len=  d.length();
        if(len ==0){
            System.out.println(" ");
            return;
        }
        bfs(0, len, new StringBuilder(), d);
    }


    public static void bfs(int pos, int len, StringBuilder sb, String d){
         if(pos == len){
             System.out.println(sb.toString());
         }else{
            char Latters[] = L[Character.getNumericValue(d.charAt(pos))];
            for(int i = 0 ; i<Latters.length ; i++)
            bfs(pos+1, len, new StringBuilder(sb).append(Latters[i]),d);
        }
     
    }
    public static void main(String[] args) {
        Lattercombination("23");
    }
}