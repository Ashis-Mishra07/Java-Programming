package SAGMENT_TREE;
public class max_min_in_range {
    static int tree[];
    public static void init(int arr[]){
        tree=new int[4 * arr.length];
    }
    public static void print(){
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
    }
    public static int making(int arr[],int i,int start,int end){
        if(start==end){
            tree[i]=arr[start];
            return arr[start];
        }
        int mid=(start+end)/2;
        int left=making(arr, 2*i+1, start, mid);
        int right=making(arr, 2*i+2, mid+1, end);
        tree[i]=Math.max(left, right);
        return tree[i];
    }
    public static int query_util(int arr[],int qi,int qj,int si,int sj,int i){
        //not overlap
        if(qj<si || qi>sj){
            return Integer.MIN_VALUE;
        }
        else if(qi<=si && qj>=sj){
            return tree[i];
        }
        else{
            int mid=(si+sj)/2;
            int left=query_util(arr, qi, qj, si, mid, 2*i+1);
            int right=query_util(arr, qi, qj, mid+1, sj, 2*i+2);

            return tree[i]=Math.max(left, right);
        }

    }
    public static int query(int arr[],int qi,int qj){
        int max=query_util(arr, qi, qj, 0, arr.length-1, 0);
        return max;
    }

    public static void updateUtil(int si,int sj,int index,int i,int newValue){
        if(index<si || index>sj){
            return ;
        }
        if(si==sj){
            tree[i]=newValue;
        }
        if(si!=sj){
            tree[i]=Math.max(tree[i], newValue);
            int mid=(si+sj)/2;
            updateUtil(si, mid, index, 2*i+1,newValue);
            updateUtil( mid+1, sj, index, 2*i+2,newValue);
        }
    }
    public static void update(int arr[],int index,int newValue){
        int diff=newValue-arr[index];
        arr[index]=newValue;
        updateUtil(0, arr.length-1, index, 0, newValue);
    }
    public static void main(String[] args) {
        int arr[]={6,8,-1,2,17,1,3,2,4};
        init(arr);
        making(arr, 0, 0, arr.length-1);
        print();
        
        
        System.out.println(query(arr, 1, 2));
        //query here is to find the maximum value between two indexes .
        
        
        
        update(arr, 2, 0);
        print();
    }
}
