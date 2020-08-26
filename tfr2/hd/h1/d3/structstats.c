#include <stdio.h>
#include <string.h>

struct uppl {
    double max;
    double min;
    double avg;
};

double my_stats(int length, double arr[]) {
    struct uppl a;
    a.max = arr[0];
    a.min = arr[0];
    a.avg = 0.0;
    // finna max
    for (int i = 0; i < length; i++) {
        if (arr[i] > a.max)
            a.max = arr[i];
    }
    // finna min
    for (int i = 0; i < length; i++) {
        if (arr[i] < a.min)
            a.min = arr[i];
    }
    a.avg = (a.min+a.max) / 2;
    return a.avg;
}       

int main() {
    double arr[] = { 1.1, 2.2, 3.3, 4.4 };
    int length = 0;
    double arr2[] = { 3.14, 9.007, 5.728, 0.19, 7.2 };
    int length2 = 0;
    int i = 0;
    int j = 0;
        while (arr[i] != '\0') {
            i++;
            length++; // skilar 3, veit ekki afk
        } length++; // skítalausn til að fá length=4
        while (arr2[j] != '\0') {
            j++;
            length2++; // skilar réttri lengd hér!? 
        }
    double prentist = my_stats(length, arr);
    printf("Fylki1: %.5f ", prentist);
    double prentist2 = my_stats(length2, arr2);
    printf("Fylki2: %.5f\n", prentist2);
}
