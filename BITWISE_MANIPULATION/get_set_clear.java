package BITWISE_MANIPULATION;

public class get_set_clear {
    public static void get(int val,int valueAt){
        val=(val>>valueAt)&1;
        if(val==1){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
    public static void set(int val,int valueAt,int key){
        if(key==0){
            val=val&(~(1<<valueAt));
            System.out.println(val);
        }
        else{
            val=val|(1<<valueAt);
            System.out.println(val);
        }
    }
    public static void clear(int val,int valueAt){
        val=val&(~(1<<valueAt));
        System.out.println(val);
    }
    public static void clear_last_ith_bit(int val,int valueAt){
        while(valueAt>=0){
            val=val&(~(1<<valueAt));
            valueAt--;
        }
        System.out.println(val);
    }
    public static void clear_range(int val,int start,int end){
        while(start>=end){
            val=val&(~(1<<start));
            start--;
        }
        System.out.println(val);
    }
    public static void main(String[] args) {
        int val=2515;
        int valueAt=2;
        // get(val, valueAt);
        // set(val, valueAt, 1);
        // clear(val, valueAt);
        // clear_last_ith_bit(val, valueAt-1);// becox taking the last two index;
        //clear(val, valueAt);
        clear_range(val, 7, 2);
    }
}
