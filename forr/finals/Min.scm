(define (MinMaxList x)
  (foldl max 0.0 (map (lambda(z) (foldl min 1.0 z)) x))
)
