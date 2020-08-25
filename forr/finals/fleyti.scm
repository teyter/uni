;; Daemi 6, 2018
;; Notkun: (MaxMinList x)
;; Fyrir: x
;; Gildi: (
(define (MaxMinList x)
  (foldl max 0.0 (map (lambda(z) (foldl min 1.0 z)) x))
)

;; fold, fall listi  u
;; max,  x y
;; map, f listi
