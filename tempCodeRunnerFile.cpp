// print 1234554321
// print 1234**4321
// print 123****321
// print 12******21
// print 1********1
#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j--)
        {
            if (j <= i)
            {
                cout << j;
            }
            else
            {
                cout << "*";
            }
        }
        for (int j = n; j >= 1; j++)
        {
            if (j <= i)
            {
                cout << j;
            }
            else
            {
                cout << "*";
            }
        }
        cout << endl;
    }
    return 0;
}
