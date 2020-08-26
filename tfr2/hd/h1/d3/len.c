#include <stdio.h>
#include <string.h>

int main() {
    char string[] = "fokk";
    int nums[] = { 1, 2, 3, 4, 5 };
    
    // hakk til að fá stærð int fylkis
    int size = sizeof(nums) / sizeof(nums[0]);

    printf("%lu\n", strlen(string));
    printf("%d\n", size);
}
