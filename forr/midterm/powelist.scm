(define (powerlist n)
  (if (= n 0)
      '(())
      ( (lambda (pl)
          (append
            (map (lambda (z) (cons 1 z)) pl)
            pl
            )
          )
       (map 
         (lambda (u)
           (map (lambda (v) (+ v 1)) u)
           )
         (powerlist (- n 1))
         )
       )
      )
  )
