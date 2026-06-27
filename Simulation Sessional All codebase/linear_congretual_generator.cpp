#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int a, c, m, seed, n;

    // Take input values
    cout << "Enter multiplier (a): ";
    cin >> a;

    cout << "Enter increment (c): ";
    cin >> c;

    cout << "Enter modulus (m): ";
    cin >> m;

    cout << "Enter initial seed (X0): ";
    cin >> seed;

    cout << "How many random numbers to generate? ";
    cin >> n;

    cout << "\nGenerated Random Numbers:\n";

    // Generate random numbers using LCG
    for (int i = 0; i < n; i++)
    {
        // LCG formula
        seed = (a * seed + c) % m;

        // Convert to value between 0 and 1
        double randomNumber = (double)seed / m;

        cout << fixed << setprecision(4)
             << randomNumber << endl;
    }

    return 0;
}