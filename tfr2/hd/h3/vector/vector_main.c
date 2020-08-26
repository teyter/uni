#include <stdio.h>
#include <stdlib.h>
#include "vector.h"


int main() {
    vector* v = vector_init();

    for (int i = 0; i < 10; i++) {
        vector_append(v, i*i);
    }

    for (unsigned int i = 0; i < vector_size(v); i++) {
        printf("v[%d] =  %d\n", i, vector_at(v,i));
    }

    printf("size = %d, capacity = %d\n", v->size, v->cap);

//    printf("\nBreytum staki 4\n");
//    vector_set(v,4,200);
//    for (unsigned int i = 0; i < vector_size(v); i++) {
//        printf("v[%d] =  %d\n", i, vector_at(v,i));
//    }
//
//    printf("\nFjarlaegum stak 4\n");
//    vector_remove(v,4);
//    for (unsigned int i = 0; i < vector_size(v); i++) {
//        printf("v[%d] =  %d\n", i, vector_at(v,i));
//    }

    printf("\nKoperum v i v2\n");
    vector* v2 = vector_copy(v);
    for (unsigned int i = 0; i < vector_size(v2); i++) {
        printf("v[%d] = %d\n", i, vector_at(v2,i));
    }

    vector_free(v);
    free(v);
}
