name: w >= 4
init: q0
accept: qAccept
// alphabet = {a}

q0,a
q1,X,>

q1,a
q2,X,>

q2,a
q3,X,>

q3,a
q4,X,>

q4,a
q4,a,>

q4,_
qAccept,_,-
