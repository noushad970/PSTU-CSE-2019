#include <iostream>
#include <random>
#include <ctime>

using namespace std;

int main()
{
    int s, S;
    double meanDemand, stdDev;
    double holdingCostPerUnit, shortageCostPerUnit;

    cout << "Enter Reorder Point (s): ";
    cin >> s;

    cout << "Enter Maximum Inventory Level (S): ";
    cin >> S;

    cout << "Enter Mean Daily Demand: ";
    cin >> meanDemand;

    cout << "Enter Standard Deviation: ";
    cin >> stdDev;

    cout << "Enter Holding Cost per Unit: ";
    cin >> holdingCostPerUnit;

    cout << "Enter Shortage Cost per Unit: ";
    cin >> shortageCostPerUnit;

    default_random_engine generator(time(0));
    normal_distribution<double> demandDistribution(meanDemand, stdDev);

    int inventory = S;

    double totalHoldingCost = 0;
    double totalShortageCost = 0;

    for (int day = 1; day <= 365; day++)
    {
        int demand = round(demandDistribution(generator));

        if (demand < 0)
            demand = 0;

        inventory -= demand;

        if (inventory < 0)
        {
            totalShortageCost += (-inventory) * shortageCostPerUnit;
            inventory = 0;
        }

        totalHoldingCost += inventory * holdingCostPerUnit;

        if (inventory <= s)
        {
            int orderQuantity = S - inventory;
            inventory += orderQuantity;
        }
    }

    cout << "\n===== Simulation Result =====\n";

    cout << "Total Holding Cost: "
         << totalHoldingCost << endl;

    cout << "Total Shortage Cost: "
         << totalShortageCost << endl;

    cout << "Ending Inventory: "
         << inventory << endl;

    return 0;
}