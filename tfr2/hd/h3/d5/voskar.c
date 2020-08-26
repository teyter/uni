#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "vector.h"

void vector_set(vector* v, int i, int x) {
    v->a[i] = x;
}

void vector_remove(vector* v, int i) {
    while (i < vector_size(v)) {
        vector_set(v,i,v->a[i+1]);
        i++;
    } 
    v->size--;
    free(v->a[vector_size(v)]);
}

vector* vector_copy (vector* v) {
    vector* v2 = vector_init();
    for (int i = 0; i < vector_size(v); i++) {
        vector_append(v2,v->a[i]);
        //printf("%d\n",v2->a[i]);
        //printf("v2[%d] = %d\n",i, vector_at(v,i));
    }
    return v2;
}

int vector_find(vector* v, int x) {
    for (int i = 0; i < vector_size(v); i++) {
        if (vector_at(v,i) == x) {
            return i;
        }
    }
    return -1;
}
