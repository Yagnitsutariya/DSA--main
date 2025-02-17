public class TRAPPING_WATER_LEETCODE {
    public static int trap(int height[]){
        int n = height.length;
        //code for find left most 
        int leftmax[] = new int[height.length];
        leftmax[0]= height[0];
        for(int i=1 ; i<n; i++ ){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        //code for find right max 
        int rightmax[]= new int[height.length];
        rightmax[n-1] = height[n-1];

        for(int i =n-2; i>=0; i--){
            rightmax[i] =Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
             trappedwater =trappedwater +waterlevel-height[i];
        }
        return trappedwater;
    }
public static void main(String[] args) {
    int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trap(height));
}    
}