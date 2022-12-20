#include <stdio.h>

int n,nf;
int in[100];
int p[50];
int pgfaultcnt = 0;
int hitCount = 0;


void getData(){
    printf("enter the length of page referece sequece\n");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
        scanf("%d",&in[i]);

    printf("enter number of frames\n");
    scanf("%d",&nf);
}

void initialize(){
    pgfaultcnt = 0;
    for(int i=0;i<nf;i++){
        p[i] = 9999;
    }
    return;
}

int isHit(int data){
   for(int i=0;i<nf;i++){
        if(p[i] == data)
            return 1;
   } 
    return 0;
} 
int gethitInt(int data){
   for(int i=0;i<nf;i++){
        if(p[i] == data)
            return i;
   } 
    return -1;
} 
 

void dispPgFault(){
    printf("total number of page fault: %d\n",pgfaultcnt);
    return;
}

void dispPage(){
    for(int i = 0;i<nf;i++){
        if(p[i] != 9999){
            printf("%d ",p[i]);
        }
    }
    return;
}

void fifo(){
    initialize();

    for(int i=0; i<n;i++){
        printf("for %d:\n",in[i]);
        if(isHit(in[i])==0){
            int j=0;
            for( j=0;j<nf-1;j++)
                p[j] = p[j+1];
           p[j] = in[i]; 
           pgfaultcnt++;
           dispPage();
        }
        else{
            hitCount++; 
            printf("no page fault\n");
        }

        dispPgFault();

    }

    return;
}


int main(){
    printf("enter your data\n");
    getData();
    fifo();
    printf("total page fault %d\n",pgfaultcnt);
    printf("total hit %d\n",hitCount);
    return 0;
}
