#include <stdio.h>

int main(int argc, char** argv)
{
    int counter = 1;
    while(counter < argc) {
        // fyrsta viðfang
        char* filename = argv[1];
        // opnar skrá til lesturs
        FILE* file = fopen(filename, "r");
        char line[1024]; // line er char fylki sem við lesum inn í

        // fgets les eina línu í einu
        while (fgets(line, sizeof(line), file)) {
        printf("%s", line);
        }
        // lokum skránni
        fclose(file);
        counter++;
    }
}
