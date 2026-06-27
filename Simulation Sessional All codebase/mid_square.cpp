#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
#include <iomanip>

using namespace std;

int main()
{
    int seed, n;

    cout << "Enter initial 4-digit seed: ";
    cin >> seed;

    cout << "How many random numbers to generate? ";
    cin >> n;

    vector<double> randomNumbers;

    cout << "\nGenerated Random Numbers:\n";

    // Mid-Square Method
    for (int i = 0; i < n; i++)
    {
        int square = seed * seed;

        // Extract middle 4 digits
        int middle = (square / 100) % 10000;

        // Convert to value between 0 and 1
        double rn = middle / 10000.0;

        randomNumbers.push_back(rn);

        cout << fixed << setprecision(4) << rn << endl;

        // Update seed
        seed = middle;
    }

    // ---------------- K-S TEST ----------------

    sort(randomNumbers.begin(), randomNumbers.end());

    double Dplus = 0, Dminus = 0;

    cout << "\nK-S Test Table:\n";
    cout << "i\tXi\t\tD+\t\tD-\n";

    for (int i = 0; i < n; i++)
    {
        double Fi = randomNumbers[i];

        // D+ calculation
        double dPlusCurrent = ((i + 1.0) / n) - Fi;

        // D- calculation
        double dMinusCurrent = Fi - (i * 1.0 / n);

        Dplus = max(Dplus, dPlusCurrent);
        Dminus = max(Dminus, dMinusCurrent);

        cout << i + 1 << "\t"
             << fixed << setprecision(4)
             << Fi << "\t"
             << dPlusCurrent << "\t"
             << dMinusCurrent << endl;
    }

    double D = max(Dplus, Dminus);

    // Critical value for alpha = 0.05
    double Dcritical = 1.36 / sqrt(n);

    cout << "\nD+ = " << Dplus << endl;
    cout << "D- = " << Dminus << endl;
    cout << "D  = " << D << endl;
    cout << "Critical Value = " << Dcritical << endl;

    // Decision
    if (D < Dcritical)
        cout << "\nResult: Random numbers follow Uniform Distribution.\n";
    else
        cout << "\nResult: Random numbers do NOT follow Uniform Distribution.\n";

    return 0;
}