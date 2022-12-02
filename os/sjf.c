#include <stdio.h>

void main(){

    int n;
    printf("enter the number of process :\n");
    scanf("%d",&n);
    int bt[n];
    int ta[n];
    int wt[n];
    float avg_ta = 0;
    float avg_wt = 0;

    printf("enter burst time \n");
    for(int i=0;i<n;i++){
        printf("P[%d]:",i+1);
        scanf("%d",&bt[i]);
    }    

    printf("process\t burst_time\n");
    for(int i=0;i<n;i++){
        printf("p[%d]\t\t %d\n",i+1,bt[i]);
    };

    //ta wt calculate
    for(int i=0;i<n;i++){
        ta[i] = bt[i];
        for(int j=0; j<n;j++){
            if(bt[i] > bt[j])
                ta[i] = ta[i] + bt[j];
        }
        wt[i] = ta[i] - bt[i];
        avg_ta += ta[i];
        avg_wt += bt[i];
    }


    printf("process\t arrive_time\t bust_time\t turnaround_time\t waitin_time\n");
    
    
    for(int i=0;i<n;i++){
        printf("P[%d]\t %d\t\t %d\t\t %d\t\t %d\n",i+1,0,bt[i],ta[i],wt[i]);
    }
    avg_ta /= n;
    avg_wt /= n;
    printf("Average Turnaround: %f\n Average waiting time; %f \n",avg_ta,avg_wt);
    
    
    return;
}
