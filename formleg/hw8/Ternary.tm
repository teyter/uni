// Input: a binary number n
// Ouput: accepts if n mod 3 == 0
// Example: accepts 110 (=6)
//
// Divisible by 3 Algorithm
// for Turing Machine Simulator 
// turingmachinesimulator.com
//
// ------- States -----------|
// q0 - mod3 == 0            |
// q1 - mod3 == 1            |
// q2 - mod3 == 2            |
// qaccept - accepting state |
//---------------------------|

name: Teitur
init: q0
accept: qAccept

q0,0
q0,0,>

q0,1
q0,1,>

q0,2
q0,2,>

q0,_
q1,_,<

q1,2
qAccept,0,-

q1,0
q2,1,<

q1,1
q2,2,<

q2,1
qAccept,0,-

q2,2
qAccept,1,-

q2,0
q3,2,<

q3,2
q3,1,<

q3,1
q3,0,<

q3,0
q3,2,<

q3,_
qAccept,_,-
