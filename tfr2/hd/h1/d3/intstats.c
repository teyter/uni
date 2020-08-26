
#include <stdio.h>
#include <string.h>

double my_stats(int length, int arr[]) {
    int max = arr[0];
    int min = arr[0];
    double avg = 0.0;
    // finna max
    for (int i = 0; i < length+1; i++) {
        if (arr[i] > max)
            max = arr[i];
    }
    // finna min
    for (int i = 0; i < length+1; i++) {
        if (arr[i] < min)
            min = arr[i];
    }
    printf("Max=%.1f\nMin=%.1f\nLen=%d\n", max, min, length);
    avg = (min+max) / 2;
    return avg;
}       

int main() {
    int arr[] = { 1, 2, 3, 4 };
    int i = 0;
    int length = 0;
        while (arr[i] != '\0') {
            i++;
            length++;
        }
    printf("%d\n", length);
    double prentist = my_stats(length, arr);
    printf("%.2f\n", prentist);
}
