#include <iostream>
#include <vector>
#include <iomanip>
#include <cmath>

using namespace std;

int main()
{
    int seed, c, m, n;

    cout << "Enter seed (X0): ";
    cin >> seed;

    cout << "Enter additive constant (c): ";
    cin >> c;

    cout << "Enter modulus (m): ";
    cin >> m;

    cout << "How many numbers to generate? ";
    cin >> n;

    vector<double> randomNumbers;

    cout << "\nGenerated Random Numbers:\n";

    // ACM Generation
    for (int i = 0; i < n; i++)
    {
        // ACM Formula
        seed = (seed + c) % m;

        // Convert to [0,1]
        double u = (double)seed / m;

        randomNumbers.push_back(u);

        cout << fixed << setprecision(4) << u << endl;
    }

    // ---------- AUTOCORRELATION TEST ----------

    int lag;

    cout << "\nEnter lag value: ";
    cin >> lag;

    // Calculate mean
    double mean = 0;

    for (double x : randomNumbers)
        mean += x;

    mean /= n;

    double numerator = 0;
    double denominator = 0;

    // Numerator
    for (int i = 0; i < n - lag; i++)
    {
        numerator +=
            (randomNumbers[i] - mean) *
            (randomNumbers[i + lag] - mean);
    }

    // Denominator
    for (double x : randomNumbers)
    {
        denominator +=
            (x - mean) * (x - mean);
    }

    // Autocorrelation coefficient
    double rho = numerator / denominator;

    cout << "\nMean = " << mean << endl;
    cout << "Autocorrelation (rho) = "
         << rho << endl;

    // Decision
    if (fabs(rho) < 0.1)
        cout << "\nResult: Numbers are Independent.\n";
    else
        cout << "\nResult: Numbers are Correlated.\n";

    return 0;
}