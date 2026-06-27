#include <iostream>
#include <vector>
#include <cmath>
#include <iomanip>

using namespace std;

int main()
{
    int a, m, seed, n;

    cout << "Enter multiplier (a): ";
    cin >> a;

    cout << "Enter modulus (m): ";
    cin >> m;

    cout << "Enter seed (X0): ";
    cin >> seed;

    cout << "How many random numbers? ";
    cin >> n;

    int allDifferent = 0;
    int onePair = 0;
    int threeSame = 0;

    cout << "\nGenerated 3-digit Numbers:\n";

    // Generate random numbers using MCG
    for (int i = 0; i < n; i++)
    {
        seed = (a * seed) % m;

        // Convert to a 3-digit number (000–999)
        int number = seed % 1000;

        cout << setw(3) << setfill('0')
             << number << endl;

        // Extract digits
        int d1 = number / 100;
        int d2 = (number / 10) % 10;
        int d3 = number % 10;

        // Poker classification
        if (d1 == d2 && d2 == d3)
        {
            threeSame++;
        }
        else if (d1 == d2 ||
                 d1 == d3 ||
                 d2 == d3)
        {
            onePair++;
        }
        else
        {
            allDifferent++;
        }
    }

    // ---------- POKER TEST ----------

    double expectedAllDifferent = 0.72 * n;
    double expectedOnePair = 0.27 * n;
    double expectedThreeSame = 0.01 * n;

    double chiSquare = 0;

    chiSquare +=
        pow(allDifferent - expectedAllDifferent, 2)
        / expectedAllDifferent;

    chiSquare +=
        pow(onePair - expectedOnePair, 2)
        / expectedOnePair;

    chiSquare +=
        pow(threeSame - expectedThreeSame, 2)
        / expectedThreeSame;

    cout << "\nPoker Test Results:\n";

    cout << "All Different = "
         << allDifferent
         << " (Expected = "
         << expectedAllDifferent << ")\n";

    cout << "One Pair = "
         << onePair
         << " (Expected = "
         << expectedOnePair << ")\n";

    cout << "Three Same = "
         << threeSame
         << " (Expected = "
         << expectedThreeSame << ")\n";

    cout << "\nCalculated Chi-Square = "
         << chiSquare << endl;

    cout << "Critical Value (df=2, alpha=0.05) = 5.991\n";

    // Decision
    if (chiSquare < 5.991)
        cout << "\nResult: Random numbers pass the Poker Test.\n";
    else
        cout << "\nResult: Random numbers fail the Poker Test.\n";

    return 0;
}