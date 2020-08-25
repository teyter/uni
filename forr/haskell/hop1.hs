{-# LANGUAGE NoMonomorphismRestriction #-}

snua = foldl (flip(:)) []

snua2 = foldl (\acc x -> [x]:acc) []
