#include<stdio.h>
#include<stdlib.h>
int main(int argc, char *argv[]){
  int array[argc-1];
  int swap;
  for(int i = 1; i < argc; i++)
      array[i-1] = atoi(argv[i]);
  for(int i = 0; i < argc-1; i++){
    for(int j = 1; j < argc-1; j++){
        if(array[j-1] > array[j]){
                swap = array[j-1];
                array[j-1] = array[j];
                array[j] = swap;
        }
    }
  }
  for(int i = 1; i < argc; i++)
      printf("%d ", array[i-1]);
  printf("\n");
  return 0;
}
