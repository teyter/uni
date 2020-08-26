#include <stdlib.h>
#include "vector.h"
// MIN FOLL ----------------------------------------------------------------------
void vec_set(vector* v, int i, int x) {
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

vector* vector_copy(vector* v) {
    vector* x = vector_init();
    for (int i = 0; i < vector_size(v); i++) {
        vector_append(x,v->a[i]);
    }
    return x;
}

int vector_find(vector* v, int x) {
    for (int i = 0; i < vector_size(v); i++) {
        if (vector_at(v,i) == x)
            return i;
    }
    return -1;
}


// GEFIN FOLL ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
vector* vector_init() {
  vector *v = (vector*) malloc(sizeof(vector));
  v->a = 0;
  v->size = 0;
  v->cap = 0;
  return v;
}

void vector_free(vector* v) {
  if (v->cap > 0) {
    free(v->a);
    v->a = 0;
    v->size = 0;
    v->cap = 0;
  }
}

int vector_at(const vector* v, unsigned int i) {
  return v->a[i];
}

unsigned int vector_size(const vector *v) {
  return v->size;
}

void vector_append(vector* v, int x) {
  if (v->size == v->cap) {
    unsigned int newcap = 2*v->cap;
    if (newcap==0) {
      newcap = 4;
    }
    int *tmp = (int*) malloc(newcap*sizeof(int));
    for (unsigned int i = 0; i < v->size; i++) {
      tmp[i] = v->a[i];
    }
    free(v->a);
    v->a = tmp;
    v->cap = newcap;
  }
  v->a[v->size] = x;
  v->size++;
}
