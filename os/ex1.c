#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>


int main(){
    printf("we pid=%d\n",getpid());
    execv("./ex2",NULL);
    printf("in ex1 \n");
    return 0;
}
