// --------- States -----------|
// q1                          |
// q2                          |
// q3  
// q4  
// q5  
// q6  
// q7  
// q8  
// q9  
// q10
// q11 
// q12  
// q13  
// q14  
// q15  
// q16  
// qAccept - accepting state   |
//-----------------------------|
// All states have this in common
// qX,x
// qX,x,>
// and
// qX,_
// q16,_,>
name: Mr. Koch
init: q1
accept: qAccept

// -------q1
q1,x
q1,x,>

q1,_
q16,_,<

q1,R
q2,R,>

q1,l
q6,l,>
// -------q2
q2,x
q2,x,>

q2,_
q16,_,<

q2,l
q3,l,>

q2,R
q2,R,>
// -------q3
q3,x
q3,x,>

q3,_
q16,_,<

q3,R
q4,R,>

q3,l
q7,l,>
// ------q4
q4,x
q4,x,>

q4,_
q16,_,<

q4,l
q5,R,<

q4,R
q2,R,>
// -----q5
q5,_
qAccept,_,-

q5,R
q13,x,<
// ------q13
q13,l
q14,x,<
// -----q14
q14,R
q15,x,-
// -----q15
q15,x
q15,x,>

q15,R
q1,R,>
// -----q6
q6,x
q6,x,>

q6,_
q16,_,<

q6,l
q7,l,>

q6,R
q2,R,>
// -----q7
q7,x
q7,x,>

q7,_
q16,_,<

q7,R
q8,R,>
// -----q8
q8,x
q8,x,>

q8,_
q16,_,<

q8,l
q9,l,<
// -----q9
q9,R
q10,x,<
// ----q10
q10,l
q11,x,<
// ----q11
q11,l
q12,x,<
// -----q12
q12,x
q12,x,>

q12,l
q1,l,>

q12,R
q1,R,>
// -----q16
q16,R
q16,R,<

q16,l
q16,l,<

q16,x
q16,x,<

q16,_
q1,_,>
