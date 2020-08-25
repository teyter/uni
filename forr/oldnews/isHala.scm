(define (f n)
    (define (h x s)
        (+ s (h (-x 1) 0)))
    h n 
    )
