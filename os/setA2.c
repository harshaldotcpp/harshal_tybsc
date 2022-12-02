#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>



int main(){

    pid_t pid = fork();
    if(pid == 0 ){
        printf("i am in child process id=%d\n",getpid());
        printf("Priority: %d ,id=%d\n",nice(20),getpid());
    }
    else{
        printf("i am in child process id=%d\n",getpid());
        printf("Priority: %d ,id=%d\n",nice(15),getpid());
    }

    return 0;
    
}

