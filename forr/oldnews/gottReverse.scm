(define (rev2 x)
  (define (snuaskeyta x y)
    (if (null? x)
        y
        (snuaskeyta (cdr x) (cons (car x) y))
        )
    )
  (snuaskeyta x '())
  )

(define (annadveldi x)
  (expt x 2)
  )
