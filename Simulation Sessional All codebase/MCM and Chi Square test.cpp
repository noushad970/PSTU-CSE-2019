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

    cout << "How many random numbers to generate? ";
    cin >> n;

    vector<double> randomNumbers;

    cout << "\nGenerated Random Numbers:\n";

    // MCM Generation
    for (int i = 0; i < n; i++)
    {
        // MCM Formula
        seed = (a * seed) % m;

        // Convert to [0,1]
        double u = (double)seed / m;

        randomNumbers.push_back(u);

        cout << fixed << setprecision(4) << u << endl;
    }

    // ---------- CHI-SQUARE TEST ----------

    int k = 5;              // Number of intervals
    double expected = (double)n / k;

    vector<int> frequency(k, 0);

    // Count frequencies
    for (double x : randomNumbers)
    {
        int index = x * k;

        // Handle x = 1 case
        if (index == k)
            index = k - 1;

        frequency[index]++;
    }

    double chiSquare = 0;

    cout << "\nClass\tObserved(O)\tExpected(E)\n";

    for (int i = 0; i < k; i++)
    {
        chiSquare += pow(frequency[i] - expected, 2) / expected;

        cout << i + 1
             << "\t" << frequency[i]
             << "\t\t" << expected << endl;
    }

    cout << "\nCalculated Chi-Square = "
         << chiSquare << endl;

    cout << "Critical Value (df=4, alpha=0.05) = 9.488\n";

    if (chiSquare < 9.488)
        cout << "\nResult: Random numbers are Uniformly Distributed.\n";
    else
        cout << "\nResult: Random numbers are NOT Uniformly Distributed.\n";

    return 0;
}