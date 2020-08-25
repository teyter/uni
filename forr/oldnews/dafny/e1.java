// Exercise in TÖL304G

// Write your name and university email address here:
//       Teitur teg6@hi.is

// Finish the following so that Dafny accepts
// it by adding some program text where indicated.
// Make no other changes.

function SumInts( k: int ): int
  requires k >= 0;
{
  if k==0 then
    0
  else
    SumInts(k-1)+k
}

method ComputeSumIntsLoop( k: int ) returns ( r: int )
  requires k >= 0;
  ensures r == (k+1)*k/2;
  ensures r == SumInts(k);
{
  ??? // <- add one or more lines here
  while ??? // <- add condition here
    decreases ??? // <- modify this line
    invariant ??? // <- add invariant, one or more lines
  {
    ??? // <- add one or more lines here
  }
  ??? // <- add zero or more lines here
}
