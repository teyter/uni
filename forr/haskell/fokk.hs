oskar x = foldl(+) 0 (map (\h -> foldl(*) 1 h) x)
