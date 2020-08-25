(define (annadveldi x)
  (if (null? x)
      x  
  (cons (* (car x) (car x))(annadveldi (cdr x)))
  )
)

;; (annadveldi (list 1 2 3 4 5))
