// Input: a binary string
// Ouput: accepts 0^n 1^n
// Example: accepts 01 0011 000111
//          rejects 0 1 10 011 001
// 
// for Turing Machine Simulator 
// turingmachinesimulator.com

name: 0^n 1^n
init: q0
accept: qAccept

q0,0
q0,0,>

q0,1
q1,1,>

q1,_
q2,_,<

q1,1
q1,1,>

q2,0
qY,0,<

q2,1
qY,1,<

q2,X
qX,X,<

qX,X
qX,X,<

qX,_
qAccept,_,>

qX,0
qY,0,<

qX,1
qY,1,<

qY,0
qY,0,<

qY,1
qY,1,<

qY,X
qY,X,<

qY,_
q3,_,>

q2,_
q3,_,>

q3,0
q4,X,>

q3,X
q3,X,>

q4,0
q4,0,>

q4,X
q4,X,>

q4,1
q5,X,>

q5,1
q5,1,>

q5,_
q2,_,<
