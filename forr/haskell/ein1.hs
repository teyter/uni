-- Notkun: listAll i n f
-- Fyrir: i er heiltala frá bilinu 0 uppí n + 1,
-- n er heiltala
-- f er fall sem er beitt á öll stök í
-- listanum [i,i+1,...,n]
-- Gildi: Listinn [f(i),f(i+1),...,f(n)]

listAll i n f =
    do {x <- map f [i..n];
    return x
}
