#include <stdio.h>
#include <string.h>

int my_grep(char* line, char* pattern) {
    for (int i = 0, k = 0; i < strlen(line); i++) {
        if (k == strlen(pattern))
            return 1;
        if (pattern[k] == line[i])
            k++; 
        else k = 0;
        }
        return 0;
}

int main(int argc, char** argv) {
    int counter = 2;
    char* pattern = argv[1];
    while (counter < argc) {
        // fyrsta viðfang
        char* filename = argv[counter];
        // opnar skrá til lesturs
        FILE* file = fopen(filename, "r");
        char line[1024];

        // fgets les eina línu í einu
        while (fgets(line, sizeof(line),file)) {
            if (my_grep(line,pattern) == 1)
                printf("%s",line);
        }
        // lokum skránni
        fclose(file);
        counter++;
    }
    return 0;
}
