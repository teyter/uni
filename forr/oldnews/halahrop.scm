(define (hrop n)
  (define (hjalp n x)
    (if (= n 0)
        x
        (hjalp (- n 1) (* n x))
               )
        )
    (hjalp n 1)
    )
