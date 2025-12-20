with open("grades.txt", "r") as file:
    grades = [float(line.strip()) for line in file if line.strip()]

print("Grades:", grades)
print("Total:", sum(grades))
print("Count:", len(grades))
print("Average:", sum(grades) / len(grades) if grades else 0)
