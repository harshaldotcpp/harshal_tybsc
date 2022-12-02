#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>



int main(){

    fork();
    int pid = fork();
    if(pid > 0 ){
        printf("i am parent process \n");
        printf("ID: %d\n",getpid());
    }
    else if(pid == 0){
        printf("i am in child process \n");
        printf("ID: %d\n",getpid());
    }
    else{
        printf("failed to create process ");
    }

    return 0;
    
}

