; Notkun: (foldl f u x)
;; Fyrir: f is a binary function,
;;        u is some value,
;;        x=(x1...xN) is a list of some values
;; Gildi: (f (f ...(f u x1)...) xN)
(define (foldl f u x)
  (if (null? x)
      u
      (foldl f (f u (car x)) (cdr x))
      )
  )

;; Notkun: (foldr f x u)
;; Fyrir: f is a binary function,
;;        x=(x1...xN) is a list of some values
;;        u is some value,
;; Gildi: (f x1 (f x2 (f ... (f xN u)...))
(define (foldr f x u)
  (if (null? x)
      u
      (f (car x) (foldr f (cdr x) u ))
      )
  )

;; Notkun: (zip2 f x y)
;; Fyrir: f is a binary function,
;;        x (x1...xN) is a list of some values
;;        y (x1...xN) is a list of some values
;; Ath:   x og y eru af jafnri lengd
;; Ath:   Ef x er tomt, skilar tomum lista
;; Gildi: Listi ((f x1 y1)...(f xN yN))
(define (zip2 f x y)
  (if (null? x)
      '()
      (cons (f (car x) (car y)) (zip2 f (cdr x) (cdr y)))
      )
  )

;; Daemi 6, 2018
;; Notkun: (MinMaxList x)
;; Fyrir: x er listi lista af fleytilolum 0.0 <= xNM <= 1.0
;; Gildi: Skila hæsta gildi af lægstu gildum innri lista
(define (MinMaxList x)
  (foldl max 0.0 (map (lambda(z) (foldl min 1.0 z)) x))
)

;; Fall fyrir fold
(define (f x y) (+ x y))
