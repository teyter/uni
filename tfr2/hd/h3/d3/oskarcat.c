#include <stdio.h>

int main(int argc, char** argv)
{
    int count = 1;
    while (count < argc) {
        // fyrsta viðfang
        char *filename = argv[count];
        // opnar skrá til lesturs
        FILE* file = fopen(filename, "r");
        char line[1024];

        // fgets les eina línu í einu
        while (fgets(line, sizeof(line),file)) {
            printf("%s",line);
        }
        // lokum skránni
        fclose(file);
        count++;
    }
}
