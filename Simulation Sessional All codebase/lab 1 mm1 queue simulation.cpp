#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>
#include <iomanip>

using namespace std;

double exponential(double mean)
{
    double u = (double)rand() / RAND_MAX;
    return -mean * log(1 - u);
}

int main()
{
    srand(time(0));

    int maxCustomers;
    double meanInterArrival, meanService;

    cout << "Enter Mean Inter-Arrival Time: ";
    cin >> meanInterArrival;

    cout << "Enter Mean Service Time: ";
    cin >> meanService;

    cout << "Enter Maximum Number of Customers: ";
    cin >> maxCustomers;

    double currentTime = 0.0;
    double serverAvailableTime = 0.0;

    double totalDelay = 0.0;
    double totalServiceTime = 0.0;

    cout << "\nCustomer Details:\n";
    cout << "-------------------------------------------------------------\n";
    cout << "No\tArrival\t\tService\tDelay\t\tDeparture\n";
    cout << "-------------------------------------------------------------\n";

    for (int i = 1; i <= maxCustomers; i++)
    {
        double interArrival = exponential(meanInterArrival);
        double serviceTime = exponential(meanService);

        currentTime += interArrival;

        double serviceStart = max(currentTime, serverAvailableTime);

        double delay = serviceStart - currentTime;

        double departureTime = serviceStart + serviceTime;

        serverAvailableTime = departureTime;

        totalDelay += delay;
        totalServiceTime += serviceTime;

        cout << i << "\t"
             << fixed << setprecision(2)
             << currentTime << "\t\t"
             << serviceTime << "\t\t"
             << delay << "\t\t"
             << departureTime << endl;
    }

    double averageDelay = totalDelay / maxCustomers;
    double averageNumberInQueue = totalDelay / serverAvailableTime;
    double serverUtilization = totalServiceTime / serverAvailableTime;

    cout << "\n================ Simulation Result ================\n";

    cout << "Average Delay in Queue (Wq): "
         << averageDelay << endl;

    cout << "Average Number in Queue (Lq): "
         << averageNumberInQueue << endl;

    cout << "Server Utilization (ρ): "
         << serverUtilization * 100 << "%" << endl;

    cout << "Time Simulation Ended: "
         << serverAvailableTime << endl;

    return 0;
}