;; Lambda expression
;; Anonymous functions!

(define (f x)
  (+ 2 x))

(define add (lambda (x y) (+ x y)))
(define sub (lambda (x y) (- x y)))

;; op: X X (X X -> Y)
(define (op x y z)
  (z x y))

;;(op 1 2 add)
;;(op 1 2 sub)

(define cuck (lambda (x z) (/ + x z z)))

(lambda (x) (/ (+ x z) z))
