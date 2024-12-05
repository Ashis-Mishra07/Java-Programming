package GREEDY_ALGORITHM;

import java.util.Arrays;
import java.util.Collections;

public class chocola_prblm {
    public static void main(String[] args) {
        Integer verti_cost[]={2,1,3,1,4};
        Integer hori_cost[]={4,1,2};

        Arrays.sort(verti_cost,Collections.reverseOrder());
        Arrays.sort(hori_cost,Collections.reverseOrder());

        int h_cut=0;
        int v_cut=0;
        int h_pieces=1;
        int v_pieces=1;

        int cost=0;
        while(h_cut<hori_cost.length && v_cut<verti_cost.length){
            if(hori_cost[h_cut] <= verti_cost[v_cut]){
                cost=cost+(verti_cost[v_cut]*h_pieces);
                v_cut++;
                v_pieces++;
            }
            else{
                cost=cost+(hori_cost[h_cut]*v_pieces);
                h_cut++;
                h_pieces++;
            }
        }
        while(h_cut<hori_cost.length){
            cost=cost+(hori_cost[h_cut]*v_pieces);
            h_cut++;
            h_pieces++;
        }
        while(v_cut<verti_cost.length){
            cost=cost+(verti_cost[v_cut]*h_pieces);
            v_cut++;
            v_pieces++;
        }

        System.out.println("total cost is "+cost);
    }
}
