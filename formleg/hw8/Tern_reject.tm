// Input: a ternary number w
// Ouput: subtracts 2 from w, computes in-place and accepts
//        rejects if outcome is negative
// Example: accepts 2011 
//          rejects 01
//
// Ternary string minus 2 
// for Turing Machine Simulator 
// turingmachinesimulator.com
//
// ------- States -----------|
// q0                        |
// q1                        |
// q2                        |
// q3                        |
// q4                        |
// q5                        |
// q6                        |
// qaccept - accepting state |
//---------------------------|

name: Ternary string - 2
init: q0
accept: qAccept

// make sure w >= 2 so 
// we dont get negative number
q0,0
q0,0,>

q0,1
q2,1,>

q0,2
q1,2,>

q2,0
q1,0,>

q2,1
q1,1,>

q2,2
q1,2,>

q1,0
q1,0,>

q1,1
q1,1,>

q1,2
q1,2,>

q1,_
q3,_,<

// w is >= 2

q3,2
q6,0,-

q3,0
q4,1,<

q3,1
q4,2,<

q4,1
q6,0,-

q4,2
q6,1,-

q4,0
q5,2,<

q5,2
q5,1,<

q5,1
q5,0,<

q5,0
q5,2,<

q5,_
q6,_,-

// make sure head ends 
// at start of string

q6,0
q6,0,<

q6,1
q6,1,<

q6,2
q6,2,<

q6,_
qAccept,_,>
