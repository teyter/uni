#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int arr[] = {1,2,3,0,4,5,6,0,7,8,9,};
    int len = sizeof(arr) / sizeof(int);

    for (int i = 0; i < len; i++) {
        while(i != 0) {

        printf("%d ", arr[i]);
    } printf("\n");
    
}
