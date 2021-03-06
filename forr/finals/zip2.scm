;; Notkun: (zip2 f x y)
;; Fyrir: f is a binary function,
;;        x (x1...xN) is a list of some values
;;        y (x1...xN) is a list of some values
;; Ath:   x og y skula vera af jafnri lengd
;; Gildi: Listi ((f x1 y1)...(f xN yN))
(define (zip2 f x y)
  (if (null? x)
      '()
      (cons (f (car x)(car y)) (zip2 f (cdr x)(cdr y)))))

(zip2 + '(1 2 3) '(1 2 3))
