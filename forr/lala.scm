;; length of list
(define len (lambda (lst)
                      (if (null? lst)
                          0
                          (+ 1 (len (cdr lst))))))
;; sum of list elements
(define sum (lambda (lst)
              (if (null? lst)
                  0
                  (+ (car lst) (sum (cdr lst))))))
;; product of list elements
(define prod (lambda (lst)
               (if (null? lst)
                   1
                   (* (car lst) (prod (cdr lst))))))

(define (square x) (* x x))
;; absolute value
(define (abs x)
  (if (< x 0)
      (- x)
      x))

(define (double value) (* 2 value))
;; (apply-twice double 2)
(define (apply-twice fn value) (fn (fn value)))
;; (swap-2-2 (list 1 2 3))
(define (swap-2-3 x)
  (list (car x)
        (caddr x)
        (cadr x)))

;; return element by index
(define (my-list-ref lst n)
  (if (zero? n)
      (car lst)
      (my-list-ref (cdr (lst) (- n 1)))))
