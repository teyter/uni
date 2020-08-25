(define (fact n)
  (if (= n 0) 1 (* n (fact (- n 1))))
  )

(define (halafact n)
  (define (hjalp n x)
    (if (= n 0)
        x
        (hjalp (- n 1) (* n x))
        )
    )
  (hjalp n 1)
  )

;;(fact 5)
(halafact 5)
