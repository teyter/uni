;; Lelegt reverse-fall
;; Fyrir x er listi (x1 ... xN)
;; Gildi: (xN ... x1)
(define (rev1 x)
  ;; Notkun (append1 x y)
  ;; Fyrir: x er list (x1 ... xN)
  ;; Gildi: (x1 ... xN y)
  (define (append1 x y)
    (if (null? x)
        (list y)
        (cons (car x) (append1 (cdr x) y))
        )
    )
  ;; stofn fallsins rev1:
  (if (null? x)
      x
      (append1 (rev1 (cdr x)) (car x))
      )
  )
;; Gott reverse fall
;; Fyrir x er listi (x1 ... xN)
;; Gildi: (xN ... x1)
(define (rev2 x)
  ;; Notkun (snua x y)
  ;; Fyrir: x er listi (x1 ... xP)
  ;;        y er listi (y1 ... yQ)
  ;; Gildi: (xP ... x1 y1 ... yQ)
  (define (snua x y)
    (if (null? x)
        y
        (snua (cdr x) (cons (car x) y))
        )
    )
  ;; stofn fallsins rev2
  (snua x '())
  )
;; Halaendurkvaemt Fibonacci-fall
;; Notkun (fibo n)
;; Fyrir: n er heiltala, >= 0
(define (fibo n)
  ;; Notkun: (hjalp f1 f2 i)
  ;; Fyrir 0 <= i <= n,
  ;;       f1 er i-ta Fibonacci talan
  ;;       f2 er (i+1)-ta Fibonacci talan
  (define (hjalp f1 f2 i)
    (if (= i n)
        f1
        (hjalp f2 (+ f1 f2) (+ i 1))
        )
    )
  ;; stofn fallsins fibo:
  (hjalp 1 1 0)
  )
;; Einfalt map fall
;; Fyrir: f er fall sem tekur eitt vidfang
;;        x er listi (x1 ... xN)
;; Gildi: Listinn (y1 ... yN thar sem
;;                y1 er (f x1)
(define (mymap f x)
  (if (null? x)
      '()
      (cons (f (car x)) (mymap f (cdr x)))
      )
  )


