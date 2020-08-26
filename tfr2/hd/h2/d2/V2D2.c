#include <stdio.h>
#include <stdlib.h>

char** split(const char* s, int *n);

int main(){
    char *s = "Þetta er ekki\tflókinn strengur";
    int n;
    char** split_s = split(s, &n);
    for(int i =0; i<=n-1; i++){
        printf("%d: %s\n", i+1, split_s[i]);
    }
}

char** split(const char* s, int *n){
    int len = 0;
    char** wordLenovo;
    int i;
    int j = 0;
    int k = 0;
    int wordCounter;
    char strengur[32];
    for(i = 0; s[i] != '\0'; i++){
        len++;
    }

    for(i=0; i<len; i++){
        if((s[i]!= ' ' && s[i+1] ==' ') || (s[i]=='\t')){
            wordCounter++;
        }
    }

    wordLenovo = (char**)malloc(wordCounter*sizeof(char*));
    for(i=0; i<wordCounter;i++){
        wordLenovo[i] = (char*)malloc(32*sizeof(char));
    }

    for(i=0; i<=len; i++){ 
        if(s[i]!=' ' && s[i] != 0 && s[i]!='\t'){ 
            strengur[j++] = s[i];
        }

        else if((s[i]==' ' && s[i+1]!= ' ') || (s[i]==0)||(s[i])=='\t'){
            for(int z = 0; z < j; z++){
                wordLenovo[k][z] = strengur[z];
            }

            wordLenovo[k++][j] = '\0';
            j = 0; 
        }
    }
    *n = wordCounter;
    return wordLenovo;
}
