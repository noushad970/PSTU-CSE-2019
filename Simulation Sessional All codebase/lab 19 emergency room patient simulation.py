import random

patients = 20

total_waiting_time = 0

triage_staff = 2
doctors = 3

triage_free = [0] * triage_staff
doctor_free = [0] * doctors

current_time = 0

print("Patient\tArrival\tPriority\tTreatment Start\tDischarge")

for i in range(1, patients + 1):

    arrival = current_time + random.randint(1, 3)
    current_time = arrival

    priority = random.randint(1, 3)

    triage_time = random.randint(2, 4)
    treatment_time = random.randint(5, 10)

    triage_index = triage_free.index(min(triage_free))

    triage_start = max(arrival, triage_free[triage_index])
    triage_end = triage_start + triage_time

    triage_free[triage_index] = triage_end

    doctor_index = doctor_free.index(min(doctor_free))

    treatment_start = max(triage_end, doctor_free[doctor_index])
    discharge_time = treatment_start + treatment_time

    doctor_free[doctor_index] = discharge_time

    waiting_time = treatment_start - arrival
    total_waiting_time += waiting_time

    print(
        i,
        arrival,
        priority,
        treatment_start,
        discharge_time,
        sep="\t"
    )

average_wait = total_waiting_time / patients

print("\nAverage Waiting Time:", round(average_wait, 2), "minutes")