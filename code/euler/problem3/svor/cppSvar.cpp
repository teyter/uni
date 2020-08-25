#include "iostream"

inline bool isprime(const __int64_t number)
{
	static __int64_t i;
	if(!(number % 2))
		return false;
	for(i = 3; i*i <= number; i += 2)
		if(!(number % i))
			return false;
	return true;
}

int main()
{
	const __int64_t number = 600851475143;
	__int64_t max = 0;
	for(__int64_t i = 3; i*i <= number; i += 2)
	{
		if(!(number % i))
			if(isprime(i))
				max = i;
	}
	std::cout << max;
	return 0;
}
