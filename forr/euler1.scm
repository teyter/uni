(define y '(1 2 3 4 5 6 8 9 9 10))
(define z 0)
(define (f x)
  (if
    (or (= (modulo x 3) 0) (= (modulo x 5) 0))
  1 0
  )
  )
(define (sum lst)
  (if (null? lst)
      0
      (+ (car lst) (sum (cdr lst)))))

(define (bla x)
  (define a 0)
  (if (= x 2)
      (+ a (cadr y))
      "no"
      ))
