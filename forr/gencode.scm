(define (d-zero name)
  (list 'define (string->symbol name) 0))

(define (d-zero-list names) (map d-zero names))

(define mycode (d-zero-list (list "a" "b" "c")))
