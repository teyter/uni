-- Notkun: powerlist x 
-- Fyrir: x er listi [x1,x2,...,xN] 
-- Gildi: Listinn [y1,y2,y3...] sem inniheldur
-- alla lista sem hægt er að smíða með        
-- því að taka núll eða fleiri gildi úr
-- x, í sömu röð og í x, og skeyta þeim
-- saman í lista.

powerlist :: [x] -> [[x]]
powerlist [] = [[]]
powerlist (x:xs) = (powerlist xs) ++ (map (x:) (powerlist xs))
