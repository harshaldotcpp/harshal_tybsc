#include <stdio.h>


int main(){

    int arrive_time[10];
    int burst_time[10];
    int temp[10];
    
    int i,smallest,count = 0,time,limit;
    double wait_time = 0, turnaround_time=0,end;

    float average_waiting_time , average_turnaround_time;
    printf("\nEnter the total number of processs max=10\n");
    scanf("%d",&limit);
    

    printf("enter detail of process");
    for(int i=0; i<limit; i++){
        printf("\nenter Arrive Time: \t");
        scanf("%d",&arrive_time[i]);
        printf("enter burst time \t");
        scanf("%d",&burst_time[i]);
        temp[i] = burst_time[i];
    }


    burst_time[9] = 9999;
    for(time = 0;count != limit; time++){
        smallest = 9;
        for(int i=0; i<limit; i++){
            if(arrive_time[i] <= time && burst_time[i] < burst_time[smallest] && burst_time[i] > 0){
                smallest = i;
            }
        }
        burst_time[smallest]--;
        if(burst_time[smallest] == 0){
            count++;
            end = time + 1;
            wait_time = wait_time + end - arrive_time[smallest] - temp[smallest];
            turnaround_time = turnaround_time + end - arrive_time[smallest];
        }
    }

    average_waiting_time = wait_time/limit;
    average_turnaround_time = turnaround_time/limit;
    printf("\n\nAverage waiting time:\t%lf",average_waiting_time);
    printf("\n\nAverage turnaround time:\t%lf\n",average_turnaround_time);

    
    return 0;
}
