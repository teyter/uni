#include <bits/stdc++.h>
using namespace std;

bool isPerfectSquare(long double x) 
{
    long double sr = sqrt(x);

    return ((sr - floor(sr)) == 0);
}

int main() 
{
    long double x = 9;
    if (isPerfectSquare(x))
        cout << "Yes\n";
    else 
        cout << "No\n";
    return 0;
}

